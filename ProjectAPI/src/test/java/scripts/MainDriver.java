package scripts;

import org.testng.Assert;

import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MainDriver {

	public static void main(String[] args) {
		  RestAssured.baseURI = "https://www.googleapis.com/books/v1/volumes";
		RequestSpecification httpRequest = RestAssured.given().param("q", "isbn:9781451648546");
		
		// JsonObject loginCredentials = new JsonObject();
		/*
		 * loginCredentials.addProperty("email", "test9@test.com");
		 * loginCredentials.addProperty("password", "123");
		 * httpRequest.body(loginCredentials.toString());
		 */
	        Response response = httpRequest.get();
	        System.out.println(response.prettyPrint());
	        //String authorizationHeader = response.getHeader("Authorization");
	       // Assert.assertNotNull(authorizationHeader);

	}

}
