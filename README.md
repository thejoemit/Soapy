# SOAP Client/Server
# Soapy

A Client/Server SOAP RMI writen in Java. 
This code was created for submission to Assignment3 for NET4005 at Carleton University in Fall 2016.

# Usage

	1. Run ServicePublisher
	2. Run ServiceClient
	
# Class descriptions

 @title 		WebServiceInterface.java
 
 This is an interface class that contains default prototype functions for the entire package
 
 @title 		ServicePublisher.java
 
 The Service Publisher creates two internal services with a shared round-robin gateway
 
 @title 		ServiceClient.java
 
 The Service client to access the External SOAP interface's login function
 
 @title 		InternalStack.java
 
 The internal functions for sending a string greeting to supplied username and to generate a random number. 
 
 @title 		ExternalStack.java
 
 The external handler that determines which server gets the job and connects to the one selected.


# References:
http://www.mkyong.com/webservices/jax-ws/jax-ws-hello-world-example/

# Creative Commons License

This work is licensed under a Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.
You accept and agree to be bound by the terms and conditions of this Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International Public License ("Public License"). To the extent this Public License may be interpreted as a contract, You are granted the Licensed Rights in consideration of Your acceptance of these terms and conditions, and the Licensor grants You such rights in consideration of benefits the Licensor receives from making the Licensed Material available under these terms and conditions.
You may read the summarized license at: https://creativecommons.org/licenses/by-nc-sa/4.0/
You may read the full license at: https://raw.githubusercontent.com/thejoemit/Soapy/master/LICENSE
