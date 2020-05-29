package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExelDataProvider {

//	public static void main(String[] args) {
//		String projectPath = System.getProperty("user.dir");
//		testData(projectPath+ "\\\\exel\\\\data.xlsx","sheet1");
//	}
	
	@Test(dataProvider = "testData")
	public void testing(String username, String password) {
		System.out.println(username + " | " + password);
	}
	
	@DataProvider(name = "testData")
	public Object[][] getData() { 
		String projectPath = System.getProperty("user.dir");
		Object data[][] = testData(projectPath+ "\\\\exel\\\\data.xlsx","sheet1");
		return data;
		
	}
	
	public static Object[][] testData(String excelPath, String sheetName) {
		
		ExelUtils excel = new ExelUtils(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColumnCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i = 1; i<rowCount; i++) {
			for(int j = 0; j<colCount; j++) {
				String cellData = excel.getCellDataString(i, j);
				//System.out.print(cellData + " | ");
				data[i-1][j] = cellData;
			}
			//System.out.println();
		}
		
		return data;
	}

}
