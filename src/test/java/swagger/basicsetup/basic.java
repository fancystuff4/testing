package swagger.basicsetup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;

public class basic {
	
	public static FileInputStream fis;
	
	public static Properties  ppt;
	@BeforeTest
	public static void basic() throws Exception {
		
		fis = new FileInputStream(".\\src\\test\\resources\\Swagger\\basicSetUp.properties");
		
		ppt =new Properties();
		
		ppt.load(fis);
		
		RestAssured.baseURI= (String) ppt.get("baseUri");
		
	}


}
