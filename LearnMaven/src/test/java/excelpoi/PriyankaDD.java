package excelpoi;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PriyankaDD {

	public static void main(String[] args) throws IOException {
		// https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Properties pop = new Properties();
		FileInputStream fip=new FileInputStream(System.getProperty("user.dir") + "\\confifg.properties");
		pop.load(fip);
		driver.get(pop.getProperty("fdcalurl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String file = System.getProperty("user.dir") + "\\testData\\data.xlsx";
		int row = PriyankaExcel.getRowCount(file, "calculateFD");
		int column = PriyankaExcel.getCellCount(file, "calculateFD", row);
		for (int i = 1; i <= row; i++) {
			String princ = PriyankaExcel.getCellData(file, "calculateFD", i, 0);
			String ROInterest = PriyankaExcel.getCellData(file, "calculateFD", i, 1);
			String period1 = PriyankaExcel.getCellData(file, "calculateFD", i, 2);
			String period2 = PriyankaExcel.getCellData(file, "calculateFD", i, 3);
			String fre = PriyankaExcel.getCellData(file, "calculateFD", i, 4);
			String Matirutyvalue = PriyankaExcel.getCellData(file, "calculateFD", i, 5);
			driver.findElement(By.cssSelector("input#principal")).sendKeys(princ);
			driver.findElement(By.id("interest")).sendKeys(ROInterest);
			driver.findElement(By.id("tenure")).sendKeys(period1);
			WebElement drpbox = driver.findElement(By.cssSelector("select#tenurePeriod"));
			Select drpbx = new Select(drpbox);
			drpbx.selectByVisibleText(period2);
			WebElement drpbox2 = driver.findElement(By.cssSelector("select[name='frequency']"));
			Select drpbx2 = new Select(drpbox2);
			drpbx2.selectByVisibleText(fre);

			// when button is not clickable we use JavascriptExecutor
			JavascriptExecutor JS = (JavascriptExecutor) driver;
			WebElement calcbutoonpath = driver.findElement(By.xpath("//div[@class='CTR PT15']//a[1]"));
			JS.executeScript("arguments[0].click();", calcbutoonpath);

			String actMat_value = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			if (Double.parseDouble(actMat_value) == Double.parseDouble(Matirutyvalue)) {
				System.out.println("Pass test");
				PriyankaExcel.setCellData(file, "calculateFD", i, 7, "Pass");
				PriyankaExcel.fillGreenColor(file, "calculateFD", i, 7);
			} else {
				System.out.println("Fail test");
				PriyankaExcel.setCellData(file, "calculateFD", i, 7, "Fail");
				PriyankaExcel.fillRedColor(file, "calculateFD", i, 7);
			}
			WebElement clearbutoonpath = driver.findElement(By.xpath("//div[@class='CTR PT15']//a[2]"));
			JS.executeScript("arguments[0].click();", clearbutoonpath);

		}
	}

}