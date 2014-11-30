package com.akash.ws.client;

import org.springframework.stereotype.Component;

import com.akash.ws.service.schema.LoginService;
import com.akash.ws.service.schema.LoginServiceService;
import com.akash.ws.service.schema.UserDetails;
import com.akash.ws.service.schema.UserDetailsRequest;
import com.akash.ws.service.schema.UserDetailsResponse;

@Component("loginClient")
public class LoginServiceClient {

//	http://itzjuzjava.blogspot.in/2012/09/generate-web-service-client-with-jax-ws.html
	
	public void callClient() {
		LoginServiceService lss = new LoginServiceService();
		System.out.println("lss ="+lss);
		LoginService ls = lss.getLoginServiceSoap11();
		System.out.println("ls ="+ls);
		UserDetailsRequest userDetailRequest = new UserDetailsRequest();
		userDetailRequest.setUserId("2");
		System.out.println("userDetailRequest ="+userDetailRequest);
		UserDetailsResponse userDetailsResponse = ls.userDetails(userDetailRequest);
		System.out.println("userDetailsResponse ="+userDetailsResponse);
		UserDetails accountDetails = userDetailsResponse.getAccountDetails();
		System.out.println("username="+accountDetails.getUsername());
		System.out.println("salary="+accountDetails.getUserSalary());
		System.out.println("emailId="+accountDetails.getEmailId());
		System.out.println("age="+accountDetails.getAge());
	}
}