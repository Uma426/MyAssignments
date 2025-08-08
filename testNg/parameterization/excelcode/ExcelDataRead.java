package testNg.parameterization.excelcode;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {

	public static String[][] readData(String filename) throws IOException {
		
	       
	      
		// To open the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./ExcelDocum/"+filename+".xlsx");

		// To open the worksheet
		// wb.getSheet("Sheet1");
		XSSFSheet ws = wb.getSheetAt(0);
		
		  int rowCount = ws.getLastRowNum();
	        int colCount = ws.getRow(0).getLastCellNum();

	        String[][] data = new String[rowCount][colCount];

	        for (int i = 1; i <= rowCount; i++) {
	            XSSFRow row = ws.getRow(i);
	            for (int j = 0; j < colCount; j++) {
	                data[i-1][j] = row.getCell(j).getStringCellValue();
	            }
	        }
	        


	        wb.close();
	        return data;

	
	}
}
