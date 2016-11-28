/**
 * @title 		ServicePublisher
 * @author 		Joseph Mitchell
 * @contact 		the(dot)joe(dot)mit[at]gmail[dot]com
 * @date		11/21/2016 @ 10:27 PM
 * @license		CREATIVE COMMONS Attribution-NonCommercial-ShareAlike 4.0 International
 * @description The Service Publisher creates two internal services with a shared round-robin gateway
 */ 
//SOAP services cannot be defined in the default package
package Soapy;
//Import WebService endpoint publishing library
import javax.xml.ws.Endpoint;
public class ServicePublisher {
	//creates a service gateway and service hosts on the localhost
	public static void main(String[] args) {
		//publish an external socket for clients to call login (Gateway)
	   Endpoint.publish("http://localhost:9999/ServiceGateway", new ExternalStack());
	   	//publish some internal sockets to use as application servers (Service Hosts)
	   Endpoint.publish("http://localhost:7777/ServiceHost", new InternalStack());
	   	//publish a second parallel server for processing application requests
	   Endpoint.publish("http://localhost:8888/ServiceHost", new InternalStack());
    }
}
