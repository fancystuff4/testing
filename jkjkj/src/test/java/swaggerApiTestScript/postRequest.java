package swaggerApiTestScript;

import static io.restassured.RestAssured.given;
import java.io.File;
import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class postRequest extends swagger.basicsetup.basic{
	@Test
	public static void main() {
		// TODO Auto-generated method stub
		
		Response response = given().contentType("application/json").body(new File (".\\src\\test\\resources\\Swagger\\post.json")).post();
		
		System.out.println("post request status:" + response.statusCode());

		Assert.assertEquals(response.statusCode(), 201, "Request filed mismatch of status");
	}

}