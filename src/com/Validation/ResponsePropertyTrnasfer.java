package com.Validation;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

import io.restassured.response.Response;

public class ResponsePropertyTrnasfer {

	public static void main(String[] args) {
		Response rep = given().get("https://reqres.in/api/users?page=2");
		//capture the last name
//		String data = rep.jsonPath().get("data[0].last_name");
//		System.out.println(data);
		//capture all last name in the array
		ArrayList<String> lis1 = rep.jsonPath().get("data.last_name");
		//transfer capture data to request
		for(int i=0; i<lis1.size(); i++) {
		given().
		pathParam("lstnm", lis1.get(i)).
		when().
		get("https://reqres.in/api/users?page=2/{lstnm}").
		then().log().all();
	}
	}
}
