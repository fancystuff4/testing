package swaggerApiTestScript;

import static io.restassured.RestAssured.given;
import java.io.File;
import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class deleteRequest extends swagger.basicsetup.basic {
	@Test
	public static void main() {
		// TODO Auto-generated method stub
		String Id = "/9";

		Response response = given().contentType("application/json").delete(Id);

		response.prettyPrint();
		System.out.println("Delete request status:" + response.statusCode());

		Assert.assertEquals(response.statusCode(), 200, "Request filed mismatch of status");
	}

}