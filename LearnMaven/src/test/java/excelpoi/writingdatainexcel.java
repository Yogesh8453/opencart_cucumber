package excelpoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingdatainexcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx"); //creates the file
		
		XSSFWorkbook wb = new XSSFWorkbook();   // create workbook
		
		XSSFSheet sheet = wb.createSheet("Data");  			//creates sheet
		
		XSSFRow row1=sheet.createRow(0);			//create 1st row		
		
		row1.createCell(0).setCellValue("Java");			//setting the values in cell for the first row
		row1.createCell(1).setCellValue(1234);
		row1.createCell(2).setCellValue("Automation");
		
		XSSFRow row2=sheet.createRow(1);			//create 2nd row		
		
		row2.createCell(0).setCellValue("Python");			//setting the values in cell for the 2nd row
		row2.createCell(1).setCellValue(234);
		row2.createCell(2).setCellValue("Automation");
		
		wb.write(file);
		wb.close();
		file.close();
		System.out.println("File is created");
		
	}

}
