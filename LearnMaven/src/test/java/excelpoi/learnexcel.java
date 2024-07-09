package excelpoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class learnexcel {

	public static void main(String[] args) throws IOException {
		
	//	System.out.println(System.getProperty("user.dir"));
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx"); //give path to read file
		System.out.println(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(file);   //get excel file  
		
		XSSFSheet sheet=wb.getSheet("calculateFD");					//get sheet
		
		int totalrow=sheet.getLastRowNum();				// get total number of rows
		
		int totalcolom=sheet.getRow(1).getLastCellNum();		// get the total coloms
		
		System.out.println("Total row:" + totalrow);
	
		System.out.println("Total coloumns:" + totalcolom);
		
		for(int row=1; row<=totalrow; row++)
		{
			XSSFRow currentrow=sheet.getRow(row);		//get the current row data
			
			for(int cells=0; cells<totalcolom; cells++)
			{
				XSSFCell celldata = currentrow.getCell(cells);  //get the current row data
				System.out.print(celldata.toString() + "\t");
			}
			System.out.println();
		}
		
		wb.close();
		file.close();

	}

}
