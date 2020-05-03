package com.restassuredTests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Demo2_Post_Request {
	public static HashMap map = new HashMap();

	@BeforeClass
	public void postData() {
		map.put("FirstName", RestUtils.getFirstName());
		map.put("LastName", RestUtils.getlastName());
		map.put("UserName", RestUtils.getUserName());
		map.put("Password", RestUtils.getPassword());
		map.put("Email", RestUtils.getEmail());

		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		RestAssured.basePath = "/register";

	}

	@Test
	public void postTest() {
		given()
			.contentType("application/json")
			.body(map)
		.when()
			.post()
		.then()
			.statusCode(200)
			.and()
			.body("SuccessCode",equalTo("OPERATION_SUCCESS"))
			.and()
			.body("Message",equalTo("Operation completed successfully"));
		
	}
}
