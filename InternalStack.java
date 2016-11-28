/**
 * @title 		InternalStack
 * @author 		Joseph Mitchell
 * @contact 		the(dot)joe(dot)mit[at]gmail[dot]com
 * @date		11/21/2016 @ 10:33 PM
 * @license		CREATIVE COMMONS Attribution-NonCommercial-ShareAlike 4.0 International
 * @description The internal functions for sending a string greeting to supplied username and to generate a random number.
 */ 
//SOAP services cannot be defined in the default package
package Soapy;
//Import Web Services
import javax.jws.WebService;
//Import Random Number Generator
import java.util.Random;
//Internal Service Stack Implementation
@WebService(endpointInterface = "Soapy.WebServiceInterface")
public class InternalStack implements WebServiceInterface{
	//a simple greeting function
	@Override
	public String getGreetingAsString(String name) {
		//return the welcome message
		return "Hello " + name + ", How are you?";
	}
	//a simple random number generator 0-100
	public Integer getRandomAsInt() {
		//define new random number
		Random randomGenerator = new Random();
		//generate new random 0-100
		return randomGenerator.nextInt(100);
	}
}
