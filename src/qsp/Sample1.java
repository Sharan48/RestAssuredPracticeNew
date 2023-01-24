package qsp;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matcher.*;

import org.json.simple.JSONObject;

public class Sample1 {
	
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		JSONObject j=new JSONObject();
		j.put("name", "Sharan");
		j.put("job", "Automation Engineet");
		req.contentType(ContentType.JSON);
		req.body(j.toJSONString());
		Response res = req.request(Method.PUT,"/api/users/2");
		System.out.println(res.asString());
		System.out.println(res.statusCode());
	
	}	
	
	}


