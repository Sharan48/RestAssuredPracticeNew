package com.parameters;

import static io.restassured.RestAssured.*;

public class FormParameter_BDD {
	public static void main(String[] main) {
		String accesstoken = given().
		formParam("client_id", "Sprint1").
		formParam("client_secret", "0923c482500bc79ccd63bd425a5896c5").
		formParam("grant_type", "client_credentials").
		when().
		post("http://coop.apps.symfonycasts.com/token").
		jsonPath().get("access_token");
		
		given().
		auth().oauth2(accesstoken).
		//you can also use path parameter
//		pathParam("id","3639").
//		pathParam("path", "chickens-feed").
		when().
		post("http://coop.apps.symfonycasts.com/api/3639/chickens-feed").
//		post("http://coop.apps.symfonycasts.com/api/{id}/{path}").
		then().log().all();
	}

}
