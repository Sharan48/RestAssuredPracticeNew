package com.parameters;

import static io.restassured.RestAssured.*;

public class QueryParameter_BDD {
	public static void main(String[] args) {
		given().
		//combination of path and query parameter
		pathParam("ownerName", "users").
		// for query parameter, data will be in key and value
		queryParam("page", "2").
		when().
		get("https://reqres.in/api/{ownerName}").
		then().log().all();
		
	}

}
