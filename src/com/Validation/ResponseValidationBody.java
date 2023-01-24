package com.Validation;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

public class ResponseValidationBody {

	public static void main(String[] args) {
	given().
	get("https://reqres.in/api/users?page=2").
	then().log().all().and().
	body("data[0].email",equalTo("michael.lawson@reqres.in") ).
	and().body("data[1].first_name", is("Lindsay")).
	and().body("data[3].last_name", is("Fields")).
	and().body("data.first_name", hasItems("Byron","Tobias"));
	
	}
}
