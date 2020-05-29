package utils;

public class ExcelUtilDemo {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		ExelUtils excel = new ExelUtils(projectPath+ "\\\\exel\\\\data.xlsx","sheet1");
		
		excel.getRowCount();
		excel.getColumnCount();
		excel.getCellDataString(0,0);
		excel.getCellDataNumber(1,1);
	}

}
