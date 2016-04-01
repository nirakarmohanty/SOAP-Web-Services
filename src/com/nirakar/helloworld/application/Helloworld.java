package com.nirakar.helloworld.application;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface Helloworld {

	@WebMethod
	public String sayHello(String args);
}
