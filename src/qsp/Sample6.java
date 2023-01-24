package qsp;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class Sample6 {
public static void main(String[] args) {
	RestAssured.baseURI="http://localhost:3000";
	RequestSpecification req = RestAssured.given();
	JSONObject j=new JSONObject();
	j.put("firstname", "Praveen");
	j.put("lastname", "Kulkarni");
	j.put("subjectId", 1);
	req.contentType(ContentType.JSON);
	req.body(j.toJSONString());
	Response res = req.request(Method.POST,"/user");
	System.out.println(res.asString());
}
}
