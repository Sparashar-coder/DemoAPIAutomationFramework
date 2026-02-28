package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class GetProfileRequestTest {
	
	@Test(description = "Checking if the Get profile is Working")
	public void getProfileInfoTest() {
		AuthService authService = new AuthService();
	Response response = authService.Login(new LoginRequest("admin1234", "admin1234"));
	LoginResponse loginResponse =	response.as(LoginResponse.class);
		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		
		System.out.println(loginResponse.getToken());
	response = 	userProfileManagementService.getProfile(loginResponse.getToken());
//	System.out.println(response.asPrettyString());\
UserProfileResponse userProfileResponse = 	response.as(UserProfileResponse.class);
		
		 System.out.println(userProfileResponse.getEmail());
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
