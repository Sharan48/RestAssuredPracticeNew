package com.Validation;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ValidateResponseBodyUsingJsonPath {
	@Test
	public void getresponsebody() {
		//it is capturing only single data
		String	data=given().
				get("https://reqres.in/api/users?page=2").
				jsonPath().get("data[1].first_name");
		System.out.println(data);

		Response res=given().
				get("https://reqres.in/api/users?page=2");

		//capture the all first name and last name from the response

		ArrayList<String> lis1 = res.jsonPath().get("data.first_name");
		ArrayList<String> lis2 = res.jsonPath().get("data.last_name");
		
		//display the all first name and last name
		for(int i=0; i<lis1.size(); i++) 
		{
			System.out.println(lis1.get(i)+"===>"+lis2.get(i));
		}
	}


	@Test
	public void validateResponse() {


		String expLastname = "Lawson";
		boolean flag=false;

		Response res = given().get("https://reqres.in/api/users?page=2");

		//capture the last name from the response

		ArrayList<String> lis2 = res.jsonPath().get("data.last_name");
		for(int i=0; i<lis2.size(); i++) {
			if(expLastname.equals(lis2.get(i))) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("expected lastname is available==PASS");
		}else {
			System.out.println("expected lastname is available==FAIL");

		}
	}

}

