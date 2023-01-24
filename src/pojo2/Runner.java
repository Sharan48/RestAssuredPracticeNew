package pojo2;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Runner 
{
public static void main(String[] args) {
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification req = RestAssured.given();
	Response res = req.request(Method.GET,"/api/users?page=2");
//	String result = res.asString();
//	JsonPath re=new JsonPath(result);
//	String f = re.getString("data[1].email");
	List_User a1 = res.as(List_User.class);
	System.out.println(a1.getPage());
	List<Data> d = a1.getData();
	for (Data d1 : d) 
	{
	System.out.println(d1.getAvatar());
	System.out.println(d1.getEmail());
	}
	System.out.println(a1.getSupport().getText());
	System.out.println(a1.getSupport().getUrl());
	
}
}
