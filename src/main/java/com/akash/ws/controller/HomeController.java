package com.akash.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.akash.ws.client.LoginServiceClient;

@Controller
public class HomeController {

//	@Autowired
//	@Qualifier("loginClient")
//	private LoginServiceClient loginClient;
	
	@RequestMapping(value="/")
	public String index() {
		LoginServiceClient loginClient = new LoginServiceClient(); 
		loginClient.callClient();
		return "index";
	}
}