package com.akash.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.akash.ws.client.impl.EmployeeClient;
import com.akash.ws.client.impl.FileUploadClient;
import com.akash.ws.client.impl.UserDetailsClient;

@Controller
public class HomeController {
	
	@Autowired
	EmployeeClient employeeClient;
	
	@Autowired
	UserDetailsClient userDetailsClient;
	
	@Autowired
	FileUploadClient fileUploadClient;
	
	@RequestMapping(value="/")
	public String index() {
		
		fileUploadClient.uploadFile();
		employeeClient.callEndpoint();
		userDetailsClient.callEndpoint();
		return "index";
	}
}