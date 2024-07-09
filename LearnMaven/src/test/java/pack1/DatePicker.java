package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	
	static void futureDatePicker(WebDriver driver, String year, String month, String date)
	{
	//	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String Cmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();		//get month
		String Cyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();			//getyear
		
		while(true)
		{
			if(Cmonth.equals(month) && Cyear.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}
		List<WebElement> dateList=driver.findElements(By.xpath("//div//table[@class='ui-datepicker-calendar']//tr//td/a"));
		for(WebElement dt:dateList)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://jqueryui.com/datepicker/");
		wd.manage().window().maximize();
		Thread.sleep(5000);
		//wd.findElement(By.cssSelector("input.hasDatepicker")).click();
		futureDatePicker(wd, "2025", "May", "10");
		

	}

}
