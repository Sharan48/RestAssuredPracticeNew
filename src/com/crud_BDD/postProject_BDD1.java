package com.crud_BDD;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

public class postProject_BDD1 {
	public static void main(String[] args) {
		JSONObject jsonobject=new JSONObject();
		jsonobject.put("email", "eve.holt@reqres.in");
		jsonobject.put("password", "pistol");
		
		given().
		contentType(ContentType.JSON).
		body(jsonobject.toJSONString()).
		when().
		post("https://reqres.in/api/register").
		then().log().all();
	}

}
