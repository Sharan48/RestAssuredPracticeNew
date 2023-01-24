package qsp;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DemoPut {
public static void main(String[] args) {
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification req = RestAssured.given();
	JSONObject obj=new JSONObject();
	obj.put("name", "Murgesh");
	obj.put("job", "automation_engg");
	req.contentType(ContentType.JSON);
	req.body(obj.toJSONString());
	Response rep = req.request(Method.PUT,"/api/users/2");
	System.out.println(rep.asString());
}
}
