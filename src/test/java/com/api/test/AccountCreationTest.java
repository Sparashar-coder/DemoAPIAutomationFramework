package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SIgnUprequest;

import io.restassured.response.Response;

public class AccountCreationTest {

	@Test(description = "Verify if the account is created")
	public void createAccountTest() {

		SIgnUprequest sIgnUprequest = new SIgnUprequest.Builder()
				.userName("Bakri781234")
				.email("Bakri123@yahoo.com")
				.firstName("Disha")
				.password("disha123")
				.lastName("bhatt")
				.mobileNumber("7777777776")
				.build();

		AuthService authService = new AuthService();
	Response response = 	authService.signup(sIgnUprequest);
	System.out.println(response.asPrettyString());
	
	Assert.assertEquals(response.asPrettyString(), "User registered successfully!");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
