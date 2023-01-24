package com.parameters;

import static io.restassured.RestAssured.*;

public class PathParameter_BDD {
	
	public static void main(String[] args) {
		given().
		pathParam("ownerName", "unknown").
		pathParam("n", "2").
		when().
		get("https://reqres.in/api/{ownerName}/{n}").
		then().log().all();
		
	}

}
