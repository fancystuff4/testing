package swaggerApiTestScript;

import static io.restassured.RestAssured.given;
import java.io.File;
import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class putRequest extends swagger.basicsetup.basic{
	@Test
	public static void main() {
		// TODO Auto-generated method stub
		String id = "cus_JeEjj4B9V8nTto";
		
		Response response = given().contentType("application/json").body(new File (".\\src\\test\\resources\\Swagger\\put.json")).put();
		
		response.prettyPrint();
		
		System.out.println(response.statusCode());
		
		Assert.assertEquals(response.statusCode(), 201,"Request filed mismatch of status");
	}

}