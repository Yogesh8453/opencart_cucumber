package excelpoi;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		wd.manage().window().maximize();
		String filepath=System.getProperty("user.dir"+"\\testdata\\data.xlsx");
		
		//System.out.println(filepath);
		int rows=excelutils.getRowCount(filepath, "calculateFD");
		
		for(int r=1;r<=rows;r++)
		{
			
			//1 read the data from excel
			
		String price=excelutils.getCellData(filepath, "calculateFD", r, 0);
		String roi=excelutils.getCellData(filepath, "calculateFD", r, 1);
		String period=excelutils.getCellData(filepath, "calculateFD", r, 2);
		String period2=excelutils.getCellData(filepath, "calculateFD", r, 3);
		String freq=excelutils.getCellData(filepath, "calculateFD", r, 4);
		String expectedmaturityvalue=excelutils.getCellData(filepath, "calculateFD", r, 5);
		
		//2 pass the data in application
		
		wd.findElement(By.xpath("//input[@id='principal']")).sendKeys(price);
		wd.findElement(By.xpath("//input[@id='interest']")).sendKeys(roi);
		wd.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period);
		Select s1 = new Select(wd.findElement(By.xpath("//select[@id='tenurePeriod']")));
		s1.selectByValue(period2);
		Select s2 = new Select(wd.findElement(By.xpath("//select[@id='frequency']")));
		s1.selectByValue(freq);
		
		wd.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();		// clicked on Calculate button
		String actualmaturityvalue=wd.findElement(By.xpath("//span[@id='resp_matval']/strong")).getText();	//captured value for verify
		
		if(Double.parseDouble(actualmaturityvalue)==Double.parseDouble(expectedmaturityvalue))
		{
			System.out.println("Test Passed");
			excelutils.setCellData(filepath, "calculteFD",r,7,"Pass");
		}
		else
		{
			System.out.println("Test Failed");
			excelutils.setCellData(filepath, "calculteFD",r,7,"Failed");
		}
		Thread.sleep(3000);
		wd.findElement(By.xpath("//img[@class='PL5']")).click();
		
		}
		wd.close();

	}

}
