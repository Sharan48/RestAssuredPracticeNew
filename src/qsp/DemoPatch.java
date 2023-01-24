
package qsp;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DemoPatch {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		JSONObject obj=new JSONObject();
		obj.put("name", "Santhosh");
		obj.put("job", "Test");
		req.contentType(ContentType.JSON);
		req.body(obj.toJSONString());
		Response res = req.request(Method.PATCH,"/api/users/2");
		System.out.println(res.asString());
	}
}
