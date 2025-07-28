package Selenium.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ResponseValidation {

	@Test
	public void getSingleUser() {
		//BaseURI
		RestAssured.baseURI= "https://reqres.in/api/users/2";
		//RequestSpecification of the API
		RequestSpecification requestspec = RestAssured.given();
		//api method
		Response response=requestspec.get();
		//validate status code
		int res=response.getStatusCode();
		System.out.println("Status code is:"+res);
		String statusLine =response.getStatusLine();
		System.out.println("Status line"+statusLine);
		//get body
		System.out.println("Body"+response.getBody().asString());
	}
	@Test
	public void getMultipleUsers() {
		
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification requestspec=RestAssured.given();
		Response response=requestspec.get("/api/users?page=2");
		//validate status code
		int res=response.getStatusCode();
		System.out.println("Status code is:"+res);
		String statusLine =response.getStatusLine();
		System.out.println("Status line"+statusLine);
		//get body
		System.out.println("Body"+response.getBody().asString());
		
	}

}
