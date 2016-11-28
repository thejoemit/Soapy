/**
 * @title 		WebServiceInterface
 * @author 		Joseph Mitchell
 * @contact 		the(dot)joe(dot)mit[at]gmail[dot]com
 * @date		11/21/2016 @ 10:27 PM
 * @license		CREATIVE COMMONS Attribution-NonCommercial-ShareAlike 4.0 International
 * @description This is an interface class that contains default prototype functions for the entire package
 */ 
//SOAP services cannot be defined in the default package
package Soapy;
//Import Web Services
import javax.jws.WebMethod;
import javax.jws.WebService;
//Import SOAP bindings
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC) //define a RPC SOAP Binding style
public interface WebServiceInterface {
	@WebMethod
	//default prototype function for the greetstring returns null
	default String getGreetingAsString(String name) {
		return null;
	}
	//default prototype function for the randomint returns -1
	@WebMethod
	default Integer getRandomAsInt() {
		return -1;
	}
	//default prototype function for the login returns null
	@WebMethod
	default public String login(String User) {
		return null;
	}
}
