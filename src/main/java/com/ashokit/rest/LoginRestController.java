package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.bindings.LoginRequest;
import com.ashokit.service.LoginService;

@RestController
public class LoginRestController {
      
	@Autowired
	private LoginService service;
	
	@PostMapping("/login")
	public String login(@RequestBody LoginRequest request) {
		return service.login(request);
	}
}
