package com.parameters;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class CombinationsOfParameters {
	public static void main(String[] args) {
		JSONObject jsonobject=new JSONObject();
		 jsonobject.put("action", "hen");
		 jsonobject.put("success", "true");
		 jsonobject.put("message", "Your chickens are now ready");
		 jsonobject.put("data", "null");
		
		
	String	accesstoken=given().
		formParam("client_id", "Sprint1").
		formParam("client_secret", "0923c482500bc79ccd63bd425a5896c5").
		formParam("grant_type", "client_credentials").
		when().
		post("http://coop.apps.symfonycasts.com/token").
		jsonPath().get("access_token");
		
		given().
		auth().oauth2(accesstoken).
		contentType(ContentType.JSON).
		body(jsonobject.toJSONString()).
		when().
		post("http://coop.apps.symfonycasts.com/api/3639/chickens-feed").
		then().log().all();
	}

}
