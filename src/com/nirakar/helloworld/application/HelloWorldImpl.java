package com.nirakar.helloworld.application;

import javax.jws.WebService;

@WebService(endpointInterface = "com.nirakar.helloworld.application.Helloworld")
public class HelloWorldImpl implements Helloworld{

	public String sayHello(String args) {
		
		return "hello " + args +" Welcome to Webservice world";
	}

}
