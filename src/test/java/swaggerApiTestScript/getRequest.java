package swaggerApiTestScript;

import static  io.restassured.RestAssured.given;
import io.restassured.RestAssured.*;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;

public class getRequest extends swagger.basicsetup.basic{
	@Test
	public static void main() {
		// TODO Auto-generated method stub
		
		Response response = given().get("/7");
		
		response.prettyPrint();
		
		System.out.println("get request status:"+response.statusCode());
		
		Assert.assertEquals(response.statusCode(), 200, "Request filed mismatch of status");
	}

}
