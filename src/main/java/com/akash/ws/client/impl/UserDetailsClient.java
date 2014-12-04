package com.akash.ws.client.impl;

import org.springframework.stereotype.Component;

import com.akash.ws.client.stub.userdetail.UserData;
import com.akash.ws.client.stub.userdetail.UserDetailsRequest;
import com.akash.ws.client.stub.userdetail.UserDetailsResponse;
import com.akash.ws.client.stub.userdetail.UserDetailsWsdlServicePort;
import com.akash.ws.client.stub.userdetail.UserDetailsWsdlServicePortService;

@Component
public class UserDetailsClient {
	
	public UserDetailsResponse callEndpoint() {
		UserDetailsWsdlServicePortService uwspService = new UserDetailsWsdlServicePortService();
		UserDetailsWsdlServicePort uwsPort = uwspService.getUserDetailsWsdlServicePortSoap11();
		UserDetailsRequest userDetailsRequest = new UserDetailsRequest();
		UserData userData = new UserData();
		userData.setUserId("97");
		userDetailsRequest.setUserData(userData);
		UserDetailsResponse response = uwsPort.userDetails(userDetailsRequest);
		System.out.println("response : "+response.getFullUserDetails().getEmailId());
		return response;
	}
}
