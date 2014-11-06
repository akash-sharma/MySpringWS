package com.akash.ws.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.akash.ws.data.reqres.UserDetailsRequest;
import com.akash.ws.data.reqres.UserDetailsResponse;
import com.akash.ws.service.UserDetailsService;

@Endpoint
public class UserDetailEndpoint {

	private static final String NAMESPACE="http://reqres.data.ws.akash.com";
	
	@Autowired
	@Qualifier("userService")
	private UserDetailsService userDetailsService;
	
	@PayloadRoot(localPart="UserDetailsRequest",namespace=NAMESPACE)
	public @ResponsePayload UserDetailsResponse getUserDetail(@RequestPayload UserDetailsRequest userDetail) {
		
		System.out.println("UserDetailEndpoint.getUserDetail()");
		return userDetailsService.getUserDetails(userDetail.getUserId());
	}
}