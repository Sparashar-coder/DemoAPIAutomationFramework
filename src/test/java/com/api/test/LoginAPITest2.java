package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Listeners(com.api.listners.TestListener.class)
public class LoginAPITest2 {

	@Test(description = "to Verify if the LOgin API is Working")
	public void testLogin() {
	
		LoginRequest loginRequest = new LoginRequest("admin1234", "admin1234");
		AuthService authService = new AuthService();
		Response response  = authService.Login(loginRequest);
		System.out.println(response.asPrettyString());
		LoginResponse loginResponse   = response.as(LoginResponse.class);
         System.out.println(loginResponse.getToken());
	
	
	Assert.assertTrue(loginResponse.getToken()!=null);
//	Assert.assertEquals(loginResponse.getEmail(), "admin456@gmail.com");
	Assert.assertEquals(loginResponse.getId(), 2277);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
