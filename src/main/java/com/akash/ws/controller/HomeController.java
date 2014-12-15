package com.akash.ws.controller;

import java.io.IOException;
import java.util.Date;

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
		
		Date startTime=new Date();
		try {
			fileUploadClient.uploadFile();
			Date endDate=new Date();
			long timetaken=endDate.getTime()-startTime.getTime();
			System.out.println("time taken to transfer file : "+timetaken);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		employeeClient.callEndpoint();
		userDetailsClient.callEndpoint();
		return "index";
	}
}