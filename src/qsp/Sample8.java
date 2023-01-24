package qsp;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample8 {
	public static void main(String[] args) {
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification req = RestAssured.given();
		JSONObject j=new JSONObject();
		j.put("firstname", "Mahesh");
		req.contentType(ContentType.JSON);
		req.body(j.toJSONString());
		Response res = req.request(Method.PATCH,"/user/5");
		System.out.println(res.asString());
	}

}
