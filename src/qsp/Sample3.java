package qsp;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Sample3 {
public static void main(String[] args) {
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification req = RestAssured.given();
	
	req.get("/api/users?page=2").
	then().
	body("data.first_name", hasItems("Michael","Lindsay")).log().all();
	
}
}
