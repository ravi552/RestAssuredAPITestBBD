package com.restassuredTests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.codehaus.groovy.transform.LogASTTransformation.LoggingStrategyV2;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Demo3_PUT_Request {

	public static HashMap map = new HashMap();

	String empName = RestUtils.empName();
	String empSalary = RestUtils.empSal();
	String empAge = RestUtils.empAge();
	int emp_id = 23;

	@BeforeClass
	public void putData() {
		map.put("Name",empName);
		map.put("Salary",empSalary);
		map.put("Age",empAge);

		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/update/"+emp_id;
	}
	@Test
	public void postTest() {
		given()
		.contentType("application/json")
		.body(map)
		.when()
		.put()
		.then()
		.statusCode(200)
		.log().all();
		
	}
}
