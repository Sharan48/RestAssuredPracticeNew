package com.Validation;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;

public class ResponseTimeValidation {
	public static void main(String[] args) {
		
		given().
		get("https://reqres.in/api/users?page=2").
		then().assertThat().time(Matchers.lessThan(5L),TimeUnit.SECONDS);
		
		//or
		
		long timeinms = given().
		get("https://reqres.in/api/users?page=2").
		timeIn(TimeUnit.MILLISECONDS);
		System.err.println(timeinms);
	}

}
