package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] data(String fileName) throws IOException {
		XSSFWorkbook wb =new XSSFWorkbook("./data/"+fileName+".xlsx");
        //Get into the sheet based index or String
        XSSFSheet ws = wb.getSheetAt(0);
        //Get into the row
        int rowCount = ws.getLastRowNum();	 	
        
        short columnCount = ws.getRow(0).getLastCellNum();
        //string [] []
         String[][] data =new String[rowCount][columnCount];
        
        for (int i = 1; i <= rowCount; i++) {
                 XSSFRow row = ws.getRow(i);
            
            for (int j = 0; j < columnCount; j++) {
                //Get into the column using row 
                  XSSFCell cell = row.getCell(j);
            
        //Read the data from cell
        String cellValue = cell.getStringCellValue();
        
        data[i-1][j]=cellValue;//[0][0]
        
        
        //print the cell value in console
        System.out.println(cellValue);
            }
        }
        
        //close the wb 
        wb.close();  
        
        return data;
        
        
    }
}