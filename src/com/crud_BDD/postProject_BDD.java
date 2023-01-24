package com.crud_BDD;

import org.json.simple.JSONObject;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;

public class postProject_BDD {

	public static void main(String[] args) {



		ResponseSpecification respo = new ResponseSpecBuilder().expectContentType(ContentType.JSON).
				expectStatusCode(201).build();

		JSONObject jsonobject=new JSONObject();
		jsonobject.put("name", "Sharan");
		jsonobject.put("job", "Automation tester");
		jsonobject.put("id", "7");

		RequestSpecification request = new RequestSpecBuilder().setBaseUri("https://reqres.in/").

				setContentType(ContentType.JSON).setBody(jsonobject.toJSONString()).build();



		given().
		//		contentType(ContentType.JSON).
		//		body(jsonobject.toJSONString()).
		spec(request).
		when().
		post("https://reqres.in/api/users/2").
		then().spec(respo).log().all();
		//		assertThat().statusCode(201).and().
		//		assertThat().contentType(ContentType.JSON);



	}
}
