package com.Validation;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class ResponseValidationHeader {
	
	public static void main(String[] args) {
		given().
		get("https://reqres.in/api/users?page=2").
		then().log().all().
		assertThat().statusCode(200).and().
		assertThat().contentType(ContentType.JSON).and().
		//user header enter key and value
		assertThat().header("Transfer-Encoding", "chunked").
		assertThat().header("CF-Cache-Status", "HIT");
		
	}

}
