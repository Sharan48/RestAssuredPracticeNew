package com.restassuredversionseliazation;

import org.testng.annotations.Test;

import com.javaproject_serialization_And_deseriliaztion.FirstProject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ContentTypeBased {

	@Test
	public void getcontentType() {

		FirstProject project=new FirstProject("InnoTech", "AWQ12", "Pritvi", 9, 98700);

		given().contentType(ContentType.JSON).body(project).
		when().get("https://reqres.in/api/users/2").
		then().log().all();	

	}
}
