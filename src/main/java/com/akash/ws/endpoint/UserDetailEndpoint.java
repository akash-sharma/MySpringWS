package com.akash.ws.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.akash.ws.server.userdetails.stub.UserDetailsRequest;
import com.akash.ws.server.userdetails.stub.UserDetailsResponse;
import com.akash.ws.service.UserDetailsService;

@Endpoint
public class UserDetailEndpoint {

	private static final String NAMESPACE="http://data.ws.akash.com/schema/userdetails";
	
	@Autowired
	@Qualifier("userService")
	private UserDetailsService userDetailsService;
	
	@PayloadRoot(localPart="UserDetailsRequest",namespace=NAMESPACE)
	public @ResponsePayload UserDetailsResponse getUserDetail(@RequestPayload UserDetailsRequest userDetailRequest) {
		
		return userDetailsService.getUserDetails( userDetailRequest.getUserData().getUserId() );
	}
}