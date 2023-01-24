package apiScript;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;


public class Script3 
{
	public static void main(String[] args) 
	{
	RequestSpecBuilder req=new RequestSpecBuilder();
	RequestSpecification res = req.setBaseUri("https://reqres.in/").
	setContentType(ContentType.JSON).build();
	Response re = given().spec(res).when().get("/api/users?page=2").then().extract().response();
	System.out.println(re.asString());
	ResponseSpecBuilder rt=new ResponseSpecBuilder();
}
}