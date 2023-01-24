package com.ecommerce.e2e;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.ecommerce.pojo.LoginCredentials;
import com.ecommerce.pojo.LoginResponse;
import com.ecommerce.pojo.OrderDetails;
import com.ecommerce.pojo.Orders;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class E2EorderNavigation {

	public static void main(String[] args) {

		//Login

		LoginCredentials login=new LoginCredentials();
		login.setUserEmail("SHARANU318@GMAIL.COM");
		login.setUserPassword("@Sharan4748");



		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").setContentType(ContentType.JSON).build();

		LoginResponse token = RestAssured.given().spec(req).body(login).
				when().post("/api/ecom/auth/login").then().log().all().
				extract().response().as(LoginResponse.class);
		System.out.println(token.getToken());
		String accesstoken = token.getToken();
		String userid = token.getUserId();

		//Add Product
		RequestSpecification addproductbaseuri = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").
				addHeader("Authorization", accesstoken).
				build();

		RequestSpecification addproductreq = RestAssured.given().spec(addproductbaseuri).param("productname", "Mobile").
				param("productaddedBy", userid).
				param("productcategory", "Fashion").
				param("productsubcategory", "T-shirt").
				param("productprize", "10000").
				param("productdescription", "DNMX Original").param("productfor", "Men").
				multiPart("productimage", new File("C://Users//Asus//Desktop//Phone.jpg"));



		String addproductresponse = addproductreq.when().post("/api/ecom/product/add-product").then().log().all().
				extract().response().toString();

		//		JsonPath js=new JsonPath(addproductresponse);
		//		String productid = js.get("productId");

		//Create Order

		RequestSpecification createorderRqust = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").
				addHeader("Authorization", accesstoken).
				setContentType(ContentType.JSON).build();

		OrderDetails orderdetails=new OrderDetails();
		orderdetails.setCountry("India");
		orderdetails.setProductOrderedId("6262e990e26b7e1a10e89bfa");

		List<OrderDetails> orderdetailsList=new ArrayList<OrderDetails>();
		orderdetailsList.add(orderdetails);

		Orders order=new Orders();
		order.setOrders(orderdetailsList);

		RequestSpecification ordererequ = RestAssured.given().spec(createorderRqust).body(order);
		
		String orderresponse = ordererequ.when().post("/api/ecom/order/create-order").then().log().all().extract().response().toString();
		System.out.println(orderresponse);
		
		//Delete Order
		RequestSpecification deletebase = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").
		addHeader("Authorization", accesstoken).setContentType(ContentType.JSON).build();
		
		String deleteresponse = RestAssured.given().spec(deletebase).relaxedHTTPSValidation().pathParam("orders", "63736b0ed7778f5797313a10").when().
		delete("https://rahulshettyacademy.com/api/ecom/order/delete-order/{orders}").then().log().all().extract().response().toString();
		
		JsonPath js=new JsonPath(deleteresponse);
		String message = js.get("message");
		System.out.println(message);
		
		
	}

}
