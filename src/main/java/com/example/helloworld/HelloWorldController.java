package com.example.helloworld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value = { "/hello" }, method = RequestMethod.GET)
	public String sayHelloWorld() {
		String responseMsg = new StringBuilder("<h1>").append("Hey...Hello World !!").append("</h1>").toString();
		return responseMsg;
	}

	@RequestMapping(value = { "/hello/{msg}" }, method = RequestMethod.GET)
	public String sayHelloMsg(@PathVariable String msg) {
		String responseMsg = "Hello World";
		try {
			responseMsg = new StringBuilder("<h1>").append("Hello ").append(msg).append("</h1>").toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseMsg;
	}
}
