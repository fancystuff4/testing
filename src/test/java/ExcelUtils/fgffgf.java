package ExcelUtils;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;



public class fgffgf {

	
	public static ArrayList<Object[]> getExceldata(Method m ) throws IOException{
		
		//String testName = m.getName();
		
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		
		String file = ".\\src\\test\\resources\\excel\\testdata.xlsx";
		
		String sheet="data";
		
		excelReader rr= new excelReader();
		
		int totalRow = rr.getRowCount(file, sheet);
		
		int totalcol = rr.getColumnCount(file,sheet,0);
		
		String req =m.getName();
		
		int x=0;
		while(!rr.getStringCellData(file, sheet, x,0).equals(req)) {
			x++;
			}
		 
		int reqStartNum = x+2;
		
		int j= reqStartNum;
		while(!rr.getStringCellData(file, sheet, j,0).equals("")) {
			
			j++;
		}
		int reqdatanum = j;
		
		
		for(int i=reqStartNum; i<reqdatanum; i++ ) {
		String id = rr.getStringCellData(file, sheet, i,0);
		
		String description = rr.getStringCellData(file, sheet, i,1);
		
		String email = rr.getStringCellData(file, sheet, i,2);
		
		System.out.println(id +" "+ description+" "+email );
		
		Object obj[] = {id, email, description};
		
		data.add(obj);
		
		}
		
		return data;
	}
	
	
}
