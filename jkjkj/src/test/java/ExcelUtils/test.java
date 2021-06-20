package ExcelUtils;

import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		excelReader rr= new excelReader();
		
		
		String file = ".\\src\\test\\resources\\excel\\testdata.xlsx";
		
		String sheet="data";
		
		int rc = rr.getRowCount(file, sheet);
		
		rr.setCellData(file, sheet,3, 1, "pqass");
		
		
		System.out.println(rc);
	}

}
