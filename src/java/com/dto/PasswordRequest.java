package com.password_verification.dto;

public class PasswordRequest {

	private String rawPassword;
	private String encodedPassword;

	public PasswordRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PasswordRequest(String rawPassword, String encodedPassword) {
		super();
		this.rawPassword = rawPassword;
		this.encodedPassword = encodedPassword;
	}

	public String getRawPassword() {
		return rawPassword;
	}

	public void setRawPassword(String rawPassword) {
		this.rawPassword = rawPassword;
	}

	public String getEncodedPassword() {
		return encodedPassword;
	}

	public void setEncodedPassword(String encodedPassword) {
		this.encodedPassword = encodedPassword;
	}

}
