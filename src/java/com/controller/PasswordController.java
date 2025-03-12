package com.password_verification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.password_verification.dto.PasswordRequest;
import com.password_verification.dto.PasswordResponse;
import com.password_verification.service.PasswordService;

@RestController
@RequestMapping("/api/password")
public class PasswordController {

	@Autowired
	private PasswordService service;
	
	@PostMapping("/encode")
	public PasswordResponse encode(@RequestBody PasswordRequest request) {
		String encodePassword = service.encode(request);
		return new PasswordResponse("Encoded Password: "+encodePassword);
	}
	
	@PostMapping("/verify")
	public PasswordResponse verifyPassword(@RequestBody PasswordRequest request) {
		boolean verifyValue = service.verify(request);
		if(verifyValue) {
			return new PasswordResponse("Passwords matches");
		}
		else {
			return new PasswordResponse("Passwords did not match");
		}
	}

}
