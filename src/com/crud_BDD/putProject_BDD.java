package com.crud_BDD;

import org.json.simple.JSONObject;

import com.google.gson.JsonObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class putProject_BDD {
	public static void main(String[] args) {
		JSONObject jsonobject=new JSONObject();
		jsonobject.put("name", "praveen");
		jsonobject.put("job", "Automation Tester");
		
		given().
		contentType(ContentType.JSON).
		body(jsonobject.toJSONString()).
		when().
		put("https://reqres.in/api/users/2").
		then().
		log().all().
		assertThat().statusCode(200).and().
		assertThat().contentType(ContentType.JSON);
		
	}

}
