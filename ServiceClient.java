/**
 * @title 		ServiceClient
 * @author 		Joseph Mitchell
 * @contact 		the(dot)joe(dot)mit[at]gmail[dot]com
 * @date		11/21/2016 @ 10:28 PM
 * @license		CREATIVE COMMONS Attribution-NonCommercial-ShareAlike 4.0 International
 * @description The Service client to access the External SOAP interface's login function
 */ 
//SOAP services cannot be defined in the default package
package Soapy;
//Import Net URL
import java.net.URL;
//Import Web Services and namespacing libraries
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
//Client to login to the gateway
public class ServiceClient {
	public static void main(String [] args) throws Exception {
		//define the service gateway as the target
		URL servingUrl = new URL("http://localhost:9999/ServiceGateway?wsdl");
		//define the namespace that the SOAP server is defined for
        QName namespace = new QName("http://Soapy/", "ExternalStackService");
        //define the service at the SOAP server
        Service serviceId = Service.create(servingUrl, namespace);
        //fetch the published port for the selected server
        WebServiceInterface servInt = serviceId.getPort(WebServiceInterface.class);
        //call login to the gateway
        System.out.println("[Forwarding Service]  " + servingUrl + "\n"+ servInt.login("Joseph"));
    }
}
