package qsp;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DemoPost 
{
	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		JSONObject obj=new JSONObject();
		obj.put("name", "Sharan");
		obj.put("job", "Test");
		req.contentType(ContentType.JSON);
		req.body(obj.toJSONString());
		Response res = req.request(Method.POST,"/api/users/2");
		System.out.println(res.asString());
	}
}
