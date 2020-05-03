package com.restassuredTests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class Demo4_DELETE_Request {

	@Test
	public void deleteEmployeeRecord() {
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/delete/2";
		
		Response response =
		given()
		.when()
			.delete()
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.log().all()
			.extract().response();
		String JsonAsString = response.asString();
		Assert.assertEquals(JsonAsString.contains("successfully!! deleted records"),true);
	}
}
