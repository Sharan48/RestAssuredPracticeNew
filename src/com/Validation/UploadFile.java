package com.Validation;



import static io.restassured.RestAssured.given;

import java.io.File;

import io.restassured.response.Response;


public class UploadFile {
	public static void main(String[] args) {
		
		File file=new File("C:\\Users\\Asus\\eclipse-workspace2\\RestAssuredPracticeNew\\project.json");
		
		Response response = given()
		.multiPart("file", file, "multipart/form-data")
		.post("https://the-internet.herokuapp.com/upload").thenReturn();
		
		System.out.println(response.prettyPrint());
		
	}

}
