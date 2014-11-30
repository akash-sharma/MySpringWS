package com.akash.ws.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.akash.ws.server.userdetails.stub.UserDetails;
import com.akash.ws.server.userdetails.stub.UserDetailsRequest;
import com.akash.ws.server.userdetails.stub.UserDetailsResponse;
import com.akash.ws.server.userdetails.stub.UserGender;
import com.akash.ws.service.UserDetailsService;

@Endpoint
public class UserDetailEndpoint {

	private static final String NAMESPACE="http://reqres.data.ws.akash.com/userdetails";
	
	@Autowired
	@Qualifier("userService")
	private UserDetailsService userDetailsService;
	
	@PayloadRoot(localPart="UserDetailsRequest",namespace=NAMESPACE)
	public @ResponsePayload UserDetailsResponse getUserDetail(@RequestPayload UserDetailsRequest userDetail) {
		
		System.out.println("UserDetailEndpoint.getUserDetail()");
		UserDetailsResponse udr=new UserDetailsResponse();
		UserDetails ud=new UserDetails();
		ud.setAge(35);
		ud.setEmailId("obama@gmail.com");
		ud.setUserGender(UserGender.MALE);
		ud.setUserId("1");
		ud.setUsername("obama");
		ud.setUserSalary(200.20);
		udr.setAccountDetails(ud);
		return udr;
	}
}