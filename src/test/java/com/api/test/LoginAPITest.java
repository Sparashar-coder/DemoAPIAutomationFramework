package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPITest {

	@Test(description = "to Verify if the LOgin API is Working")
	public void testLogin() {
				Response response = given().baseUri("http://64.227.160.186:8080").header("Content-Type", "application/json").body("{\"username\": \"admin1234\",\"password\": \"admin1234\"}").post("/api/auth/login");
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);

	}

}
