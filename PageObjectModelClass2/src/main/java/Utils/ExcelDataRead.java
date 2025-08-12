package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {

	public static String[][] readData(String filename) throws IOException {
		// To open the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./ExcelDoc/"+filename+".xlsx");

		// To open the worksheet
		// wb.getSheet("Sheet1");
		XSSFSheet ws = wb.getSheetAt(0);

		// To count the number of rows
		// including header
		int physicalNumberOfRows = ws.getPhysicalNumberOfRows();
		System.out.println("Including header: " + physicalNumberOfRows);

		// excluding header
		int rowCount = ws.getLastRowNum();
		System.out.println("The row count is: " + rowCount);

		// To count the column
		int columnCount = ws.getRow(0).getLastCellNum();
		System.out.println("The ColumnCount is: " + columnCount);

		// To retrieve a single data
		String row1Cell1Value = ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println("The value is: " + row1Cell1Value);

		String[][] data=new String[rowCount][columnCount];
		
		// To retrieve the entire data
		// 1 2 rowCount=2
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			// XSSFRow row2 = ws.getRow(2);
			// 0 1 2 columnCount=3
			for (int j = 0; j < columnCount; j++) {
				String allData = row.getCell(j).getStringCellValue();
				// String allData = row1.getCell(0).getStringCellValue(); //Qeagle
				// String allData = row1.getCell(1).getStringCellValue(); //Hari
				//// String allData = row1.getCell(2).getStringCellValue(); //R
				// String allData = row2.getCell(0).getStringCellValue(); //TestLeaf
				// String allData = row2.getCell(1).getStringCellValue(); //Vineeth
				// String allData = row2.getCell(2).getStringCellValue(); //Rajendran
                
				data[i-1][j]=allData;
                //data[0][0]=Qeagle
                //data[0][1]=Hari
                //data[0][2]=R
                
                //data[1][0]=TestLeaf
                //data[1][1]=Vineeth
                //data[1][2]=Rajendran
                
                
				
			}

		}
		wb.close();
return data;
	}
	

}
