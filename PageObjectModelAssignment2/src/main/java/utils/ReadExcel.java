package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ReadExcel {
//                                         EditLead
	public static String[][] readData(String filename) throws IOException {
		// To open the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./Data/"+filename+".xlsx");

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

		String[][] data = new String[rowCount][columnCount];

		// To retrieve the entire data

		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = ws.getRow(i);
/*
			for (int j = 0; j < columnCount; j++) {
				String allData = row.getCell(j).getStringCellValue();

				data[i - 1][j] = allData;
				*/
			  for (int j = 0; j < columnCount; j++) {
	                XSSFCell cell = row.getCell(j);

	                // Handle different cell types
	                if (cell.getCellType() == CellType.NUMERIC) {
	                    data[i - 1][j] = String.valueOf((long) cell.getNumericCellValue());
	                } else {
	                    data[i - 1][j] = cell.getStringCellValue();
	                }

			}

		}
		wb.close();
		return data;
	}

}
