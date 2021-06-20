package StripeApitestingScript;

import static  io.restassured.RestAssured.given;
import io.restassured.RestAssured.*;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;

import StripeApi.basicsetup.basic;

public class postRequest extends StripeApi.basicsetup.basic{
	@Test(dataProviderClass = basic.class, dataProvider = "data")
	public static void postRequest(String id, String email, String description) {
		// TODO Auto-generated method stub
		
		Response response = given().auth().basic( key, "")
				.formParam("description", description).formParam("email", email)
				.post();
		
		response.prettyPrint();
		
		System.out.println("post request status:"+response.statusCode());
		
		Assert.assertEquals(response.statusCode(), 200, "Request filed mismatch of status");
	}

}
