package com.password_verification.dto;

public class PasswordResponse {

	private String message;

	public PasswordResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PasswordResponse(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
