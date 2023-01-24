package pojo1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Runner 
{

	public static void main(String[] args)
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET,"/api/users/2");
		 SingleUser str = res.as(SingleUser.class);
		 Support s1 = str.getSUPPORT();
		 System.out.println(s1.getText());
		 Data d = str.getDATA();
		 System.out.println(d.getEmail());
	}
}
