package StripeApi.basicsetup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import ExcelUtils.fgffgf;
import io.restassured.RestAssured;

public class basic {
	
	public static FileInputStream fis;
	
	public static  String key;
	public static Properties  ppt;
	@BeforeTest
	public static void basic() throws Exception {
		
		fis = new FileInputStream(".\\src\\test\\resources\\StripeApi\\basicSetUp.properties");
		
		ppt =new Properties();
		
		ppt.load(fis);
		
		RestAssured.baseURI= (String) ppt.get("baseUri");
		RestAssured.basePath= (String) ppt.get("basepath");
		key= (String) ppt.get("key");
		//RestAssured.Token=(String) ppt.get("key");
	}
	
	@DataProvider(name="data")
	public static Iterator<Object[]> sendcelldata(Method m) throws IOException {
		
	ArrayList<Object[]>	xxx= fgffgf.getExceldata(m);
		
		return xxx.iterator();
	}


}
