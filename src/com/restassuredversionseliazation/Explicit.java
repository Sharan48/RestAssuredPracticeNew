package com.restassuredversionseliazation;

import org.testng.annotations.Test;

import com.javaproject_serialization_And_deseriliaztion.FirstProject;

import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;

import static io.restassured.RestAssured.*;

public class Explicit {
	
	@Test
	public void getExplicit() {
		
		FirstProject project=new FirstProject("InotechSolution", "HGD45", "Richard", 2, 5600);
		
		given().contentType(ContentType.JSON).body(project, ObjectMapperType.JACKSON_1).
		when().post("https://reqres.in/api/users/2").
		then().log().all();
	}

}
