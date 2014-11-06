package com.akash.ws.service;

import com.akash.ws.data.reqres.UserDetailsResponse;

public interface UserDetailsService {
	
	public UserDetailsResponse getUserDetails(String userId);
}


//		http://briansjavablog.blogspot.in/2013/01/spring-web-services-tutorial.html
//		http://stackoverflow.com/questions/1155809/spring-ws-generates-wsdl-without-operations