package com.crud_BDD;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class patchProject_BDD {
	
	public static void main(String[] args) {
		
		JSONObject jsonobject=new JSONObject();
		jsonobject.put("name", "Devaraj");
		
		given().
		contentType(ContentType.JSON).
		body(jsonobject.toJSONString()).
		when().
		patch("https://reqres.in/api/users/2").
		then().log().all();
		
	}

}
