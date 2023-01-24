package com.crud_BDD;

import org.json.simple.JSONObject;

import com.google.gson.JsonObject;

import static io.restassured.RestAssured.*;

public class deleteProject_BDD {

	public static void main(String[] args) {
		
		when().
		delete("https://reqres.in/api/users/2").
		then().log().all();
		
	}
}
