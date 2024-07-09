package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://testautomationpractice.blogspot.com/");
		wd.manage().window().maximize();
		List<WebElement> noofpages=wd.findElements(By.xpath("//ul[@class='pagination']//li"));
		List<WebElement> noofrows=wd.findElements(By.xpath("//div/table[@id='productTable']/tbody/tr"));
		int rows=noofrows.size();
		int totalpages=noofpages.size();
		System.out.println("Total No of Pages "+ totalpages);
		for(int i = 1; i<=totalpages; i++)
			
		{
			if(i>1)
			{
				wd.findElement(By.xpath("//a[normalize-space()='"+i+"']")).click(); 
			}
			
			for(int r=1; r<=rows;r++)
			{
				String name=wd.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td[2]")).getText();
				String Price=wd.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td[3]")).getText();
				wd.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td[4]/input[@type='checkbox']")).click();
				
				System.out.print(name+"\t");
				System.out.print(Price);
				System.out.println();
			}
			Thread.sleep(1000);
		}
		

	}

}
