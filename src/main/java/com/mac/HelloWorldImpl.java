package com.mac;

import javax.jws.WebService;

@WebService(endpointInterface="com.mac.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String hello(String str) {
		return str;
	}

}
