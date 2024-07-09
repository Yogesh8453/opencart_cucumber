package day8KDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.PomSaucedemo;
public class Saucedemo_KDF_Logintestcases {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./chromedriver");
		WebDriver wd=new ChromeDriver();
//		wd.manage().window().fullscreen();
//		wd.get( "http://localhost/phpmyadmin/");
		PomSaucedemo p= new PomSaucedemo(wd);
	    FileInputStream fis=new FileInputStream("/home/luser/Desktop/selenium/data.xlsx");
		XSSFWorkbook wk= new XSSFWorkbook(fis);
		XSSFSheet sh= wk.getSheet("sauceKDF");
			
			 for(int i=1; i<=sh.getLastRowNum();i++)
			  {
			   XSSFRow rw= sh.getRow(i);
			   XSSFCell key = rw.getCell(4);
			   XSSFCell res= rw.createCell(5);
			   System.out.println("keywords - "+key);
			   
			   switch (key.toString()) {
			   case "url": 
			   {
				   try 
					  {
					   // wd.get("https://www.saucedemo.com/");
					    p.url("https://www.saucedemo.com/");
					    Thread.sleep(2000);
					    System.out.println("Pass");
					    res.setCellValue("Pass");
					  }catch ( Exception e)
					  {
					  System.out.println("Fail");
					  res.setCellValue("Fail");
					  }
				   break;
			   }
			   case "urn": 
			   {
				   try
				   {
					 p.username("standard_user");
					 Thread.sleep(2000);
				    //wd.findElement(By.xpath("//*[@id=\"input_username\"]")).sendKeys("standard_user");
				    System.out.println("Pass");
			        res.setCellValue("Pass");
			       }catch ( Exception e)
			       {
			         System.out.println("Fail");
			         res.setCellValue("Fail");
			       }
				break;
			   }
			   case "pd": 
			   {
				try 
				{	
					p.password("secret_sauce");
					Thread.sleep(2000);
			      // wd.findElement(By.xpath("//*[@id=\"input_password\"]")).sendKeys("secret_sauce");
			       System.out.println("Pass");
		           res.setCellValue("Pass");
		        }catch ( Exception e)
		        {
		           System.out.println("Fail");
		           res.setCellValue("Fail");
		         }
				break;
			   }
			   case "ln": 
			   {
				   try
				   {
					   p.loginbtn();
					   Thread.sleep(2000);
				    // wd.findElement(By.xpath("//*[@id=\"input_go\"]")).click();
				     System.out.println("Pass");
		             res.setCellValue("Pass");
		           }catch ( Exception e)
		           {
		             System.out.println("Fail");
		             res.setCellValue("Fail");
		            }
				  break;
			   }
			   case "lo": 
			   {
				   try
				   {
					   p.logout();
					   Thread.sleep(2000);
					 //  wd.findElement(By.xpath("//*[@id=\"navipanellinks\"]/a[2]/img")).click();
				       System.out.println("Pass");
		               res.setCellValue("Pass");
		           }catch ( Exception e)
		           {
		             System.out.println("Fail");
		             res.setCellValue("Fail");
		            }  
				break;
			   }
			   default:
			   {
				   System.out.println("Invalid Keyword");
				   break;
			   }
			   }
			  }
			 wd.close();
			 fis.close();
			 FileOutputStream fos= new FileOutputStream("/home/luser/Desktop/selenium/data.xlsx");
			 wk.write(fos);
	}
}
