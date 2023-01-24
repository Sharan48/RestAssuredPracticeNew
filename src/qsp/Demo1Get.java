package qsp;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1Get 
{
	public static void main(String[] args)
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();//abstraction
		Response res = req.request(Method.GET,"/api/users?page=2");
		String str = res.asString();
		System.out.println(str);
	}
}
