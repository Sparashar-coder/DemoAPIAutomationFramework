package com.api.base;

import java.util.HashMap;

import com.api.models.request.LoginRequest;
import com.api.models.request.SIgnUprequest;

import io.restassured.response.Response;

public class AuthService extends baseService{
	
	private final static String BASE_PATH = "/api/auth/";
	
	public Response Login(LoginRequest payload) {
		return postRequest(payload,BASE_PATH+"login");
	}
		 public Response signup(SIgnUprequest payload) {
			 return  postRequest(payload, BASE_PATH + "signup");
		 }
		 
		 public Response forgotpassword(String emailAddress) {
			 HashMap<String , String> payload = new HashMap<>();
			 payload.put("email", emailAddress);
			 
			 return  postRequest(payload, BASE_PATH + "forgot-password");
		 }
	

}
