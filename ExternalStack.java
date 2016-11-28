/**
 * @title 		ExternalStack
 * @author 		Joseph Mitchell
 * @contact 		the(dot)joe(dot)mit[at]gmail[dot]com
 * @date		11/21/2016 @ 10:36 PM
 * @license		CREATIVE COMMONS Attribution-NonCommercial-ShareAlike 4.0 International
 * @description The external handler that determines which server gets the job and connects to the one selected.
 */ 
//SOAP services cannot be defined in the default package
package Soapy;
//Import Java NET URL libraries
import java.net.MalformedURLException;
import java.net.URL;
//Import Web Services and namespacing libraries
import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
//External Service Stack Implementation
@WebService(endpointInterface = "Soapy.WebServiceInterface")
public class ExternalStack implements WebServiceInterface{
	public Integer clientCounter = 0; // initialize the client counter at 0
	@Override
	public String login(String Username) { //external stack available function call login
		String serverid = null;
		clientCounter++; //increment client counter
		if ((clientCounter % 2) != 0) { //if the client is an odd number
			serverid = "http://localhost:7777/ServiceHost?wsdl"; //odd server
		} else {
			serverid = "http://localhost:8888/ServiceHost?wsdl"; //even server
		}
		URL processingUrl = null; //default url at null
		try {
			//set static service host one
			processingUrl = new URL(serverid);
		} catch (MalformedURLException e) {
			//AUTOGENERATED: catch on error
			e.printStackTrace();
		}
		//define the namespace that the SOAP server is defined for
		 QName namespace = new QName("http://Soapy/", "InternalStackService");
        //define the service at the SOAP server
        Service serviceId = Service.create(processingUrl, namespace);
        //fetch the published port for the selected server
        WebServiceInterface servInt = serviceId.getPort(WebServiceInterface.class);
        //return content fetched from an internal SOAP call. 
		return "[Processing Server]   " + processingUrl + "\n[Client # " + clientCounter + "] " + servInt.getGreetingAsString(Username) +  " Lucky Number: " + servInt.getRandomAsInt();
	}
}
