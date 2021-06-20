package StripeApitestingScript;

import static io.restassured.RestAssured.given;
import java.io.File;
import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import StripeApi.basicsetup.basic;
import io.restassured.response.Response;

public class putRequest extends StripeApi.basicsetup.basic {
	@Test(dataProviderClass = basic.class, dataProvider = "data")
	public static void putRequest(String id, String email, String description) {
		// TODO Auto-generated method stub
		//String id = "/cus_JeEjohlQEwahbe";

		Response response = given().auth().basic(key, "").formParam("email", email)
				.formParam("description", description).post(id);

		response.prettyPrint();

		System.out.println(response.statusCode());

		Assert.assertEquals(response.statusCode(), 200, "Request filed mismatch of status");
	}

}