package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class UpdateProfileTest {
	
	@Test(description = "Verify if the Update Request is working")
	public void UpdateProfile() {
		
		AuthService authService = new AuthService();
	Response response = 	authService.Login(new LoginRequest("admin1234","admin1234"));
	LoginResponse loginResponse = 	response.as(LoginResponse.class);
	System.out.println(response.asPrettyString());
	
	System.out.println("****************************************");
	
	UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
	response = userProfileManagementService.getProfile(loginResponse.getToken());
	System.out.println(response.asPrettyString());
	UserProfileResponse userProfileResponse = 	response.as(UserProfileResponse.class);
		Assert.assertEquals(userProfileResponse.getUsername(), "admin1234");

	System.out.println("*8888888********************************");
	
	ProfileRequest profileRequest = new ProfileRequest.Builder()
			.firstName("bakasuqwer")
			.lastName("bnghaare12qwe31")
			.email("bnghaare12qwe31@yahoo.com")
			.mobileNumber("6645128956").build();
		
	response = userProfileManagementService.updateProfile(loginResponse.getToken(), profileRequest);
	System.out.println(response.asPrettyString());

	}
	
	
	
	
	
	
	
	
	
	
	
	

}
