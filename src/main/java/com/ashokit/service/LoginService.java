package com.ashokit.service;

import org.springframework.stereotype.Service;

import com.ashokit.bindings.LoginRequest;

@Service
public interface LoginService {
	
	public String login(LoginRequest request) ;
	
	
	

}
