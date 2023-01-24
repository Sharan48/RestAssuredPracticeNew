package qsp;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;

public class Sample2 {
public static void main(String[] args) {
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification req = RestAssured.given();
	Response res = req.request(Method.GET,"/api/users?page=2");
	String str = res.asString();
	JsonPath p=new JsonPath(str);
	Object d = p.get("data[1].id");
	System.out.println(d);
}
}
