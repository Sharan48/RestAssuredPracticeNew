package qsp;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample5 {
public static void main(String[] args) {
	RestAssured.baseURI="http://localhost:3000";
	RequestSpecification req = RestAssured.given();
	Response res = req.request(Method.GET,"/user");
	System.out.println(res.getStatusCode());
}
}
