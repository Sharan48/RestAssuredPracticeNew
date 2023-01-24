package com.restassuredversionseliazation;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class HashmapBased {

	@Test
	public void gethasmapType() {
		
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("name", "Sharan");
		map.put("job", "Automation tester");
		map.put("id", 7);
		
		given().
		contentType(ContentType.JSON).
		body(map).
		when().
		post("https://reqres.in/api/users/2").
		then().log().all();
		
	}
}
