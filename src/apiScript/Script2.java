package apiScript;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class Script2
{
	public static void main(String[] args) 
	{
		RequestSpecBuilder req=new RequestSpecBuilder();
		RequestSpecification rsp = req.setBaseUri("https://reqres.in/").
		setContentType(ContentType.JSON).build();
		given().spec(rsp).get("/api/users?page=2").then().assertThat().statusCode(200).and().
		contentType(ContentType.JSON);
		System.out.println("done");
	}

}
