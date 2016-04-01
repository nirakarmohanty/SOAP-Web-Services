package com.nirakar.helloworld.application;

import java.util.Timer;
import java.util.TimerTask;

import javax.xml.ws.Endpoint;

@SuppressWarnings("restriction")
public class HelloWorldPublisher extends TimerTask {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new HelloWorldPublisher(), 0, 5000);
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
	}

	public void run() {
		System.out.println("Hello World Web service is running !!!!");
	}

}
