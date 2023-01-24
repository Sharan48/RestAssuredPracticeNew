package com.crud_BDD;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class getProject_BDD {

 public static void main(String[] args) {
	 
	when(). 
	get("https://reqres.in/api/users/2").
	then().
	log().all()
	.assertThat().statusCode(200)
	.and()
	.assertThat().contentType(ContentType.JSON);
	
 }
}
