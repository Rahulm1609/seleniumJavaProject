package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelUtils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	


	public  ExelUtils(String excelPath,String sheetName){
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public int getRowCount() {

		int rowCount = 0;
		try {
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows : " + rowCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return rowCount;
		
		

	}
	
	public int getColumnCount() {

		int colCount = 0;
		try {
			colCount  = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Number of columns : " + colCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return colCount;

	}

	public String getCellDataString(int rowNum, int cellNum) {

		String cellDataString = null;
		try {
			cellDataString = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
			//System.out.println(cellDataString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cellDataString;

	}
	
	public void getCellDataNumber(int rowNum, int cellNum) {

		try {
			double cellDataNum = sheet.getRow(rowNum).getCell(cellNum).getNumericCellValue();
			System.out.println(cellDataNum);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
