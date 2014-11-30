package com.akash.ws.service.impl;

import org.springframework.stereotype.Service;

import com.akash.ws.server.userdetails.stub.UserDetails;
import com.akash.ws.server.userdetails.stub.UserDetailsResponse;
import com.akash.ws.server.userdetails.stub.UserGender;
import com.akash.ws.service.UserDetailsService;

@Service("userService")
public class UserDetailsServiceImpl implements UserDetailsService {

	public UserDetailsResponse getUserDetails(String userId) {
		System.out.println("UserDetailsServiceImpl.getUserDetails()");
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