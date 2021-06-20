package StripeApitestingScript;

import static io.restassured.RestAssured.given;
import java.io.File;
import java.util.Hashtable;
import org.testng.Assert;
import org.testng.annotations.Test;
import StripeApi.basicsetup.basic;
import io.restassured.response.Response;

public class getRequest extends StripeApi.basicsetup.basic{
	
	@Test(dataProviderClass = basic.class, dataProvider = "data")
	public static void getRequest(String id, String description, String email) {
		// TODO Auto-generated method stub
		//String id = "/cus_JeEjohlQEwahbe";

		Response response = given().auth().basic( key, "").get(id);

		response.prettyPrint();

		System.out.println(response.statusCode());

		Assert.assertEquals(response.statusCode(), 200, "Request filed mismatch of status");
	}

}