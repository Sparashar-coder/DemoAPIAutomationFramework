package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotpasswordTest {
	
	@Test(description = "Check if the forgot password is working")
	public void forgotpassTest() {
		
		AuthService authService = new AuthService();
		
		Response response = authService.forgotpassword("bakri123@yahoo.com");
		System.out.println(response.asPrettyString());
		
	}

}
