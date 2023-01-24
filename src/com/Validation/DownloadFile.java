package com.Validation;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class DownloadFile {
	
	public static void main(String[] args) throws IOException {
		
		byte[] bytes = given().
		when().get("https://reqres.in/api/users/2").andReturn().getBody().asByteArray();
		
		File newfile=new File("./test-output/user.json");
		Files.write(newfile.toPath(),bytes);
		
		
	}

}
