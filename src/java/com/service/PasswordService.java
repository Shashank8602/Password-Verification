package com.password_verification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.password_verification.dto.PasswordRequest;

@Service
public class PasswordService {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public String encode(PasswordRequest request) {
		String encodePassword = passwordEncoder.encode(request.getRawPassword());
		return encodePassword;
	}
	
	public boolean verify(PasswordRequest request) {
		boolean matchValue = passwordEncoder.matches(request.getRawPassword(), request.getEncodedPassword());
		return matchValue;
	}

}
