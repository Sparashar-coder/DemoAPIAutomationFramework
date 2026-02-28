package com.api.models.request;

public class LoginRequest {
	
	private String username;
	private String Password;
	public LoginRequest(String username, String password) {
		super();
		this.username = username;
		Password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "LoginRequest [username=" + username + ", Password=" + Password + "]";
	}
	
	

}
