package com.akash.ws.service.impl;

import org.springframework.stereotype.Service;

import com.akash.ws.server.userdetails.stub.FullUserDetails;
import com.akash.ws.server.userdetails.stub.UserDetailsResponse;
import com.akash.ws.server.userdetails.stub.UserGender;
import com.akash.ws.service.UserDetailsService;

@Service("userService")
public class UserDetailsServiceImpl implements UserDetailsService {

	public UserDetailsResponse getUserDetails(String userId) {
		
		UserDetailsResponse udr=new UserDetailsResponse();
		FullUserDetails ud=new FullUserDetails();
		ud.setAge(35);
		ud.setEmailId("obama@gmail.com");
		ud.setUserId("1");
		ud.setUserGender(UserGender.MALE);
		ud.setUsername("obama");
		ud.setUserSalary(200.20);
		udr.setFullUserDetails(ud);
		return udr;
	}
}