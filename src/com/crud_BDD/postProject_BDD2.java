package com.crud_BDD;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class postProject_BDD2 {
	
public static void main(String[] args) {
	
	JSONObject jsonobject=new JSONObject();
	 jsonobject.put("email", "eve.holt@reqres.in");
	 jsonobject.put("password", "cityslicka");
	 
	 given().
	 contentType(ContentType.JSON).
	 body(jsonobject.toJSONString()).
	 when().
	 post("https://reqres.in/api/login").
	 then().log().all().
	 assertThat().statusCode(200).and().
	 assertThat().contentType(ContentType.JSON);
	 
}
}
