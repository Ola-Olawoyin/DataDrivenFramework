package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class UserRegTest extends BaseTest {
	
	
	@Test(dataProvider = "data")
	public void doUserRegTest(String firstName, String lastName, String address) {
		System.out.println(firstName+"-----"+lastName+"-----"+address);
		
		
	}
	
	@DataProvider(name="data")
	public Object[][] getData()
	{
		
		String sheetName = "UserRegTest";
		int rowNum = excel.getRowCount(sheetName);
		int colNum = excel.getColumnCount(sheetName);
		
		
		Object[][] data = new Object[rowNum -1][colNum];
		
		for(int rows = 2; rows<=rowNum; rows++) {
			
			for(int cols = 0; cols<colNum; cols++) {
				
				data[rows-2][cols] = excel.getCellData(sheetName, cols, rows);
			}
		}
		
		return data;

	}
	

}
