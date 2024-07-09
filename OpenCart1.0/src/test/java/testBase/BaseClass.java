package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import javax.print.DocFlavor.URL;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger; //log4j

public class BaseClass {

	static public WebDriver wd;
	public Logger logger;
	public Properties p;

	@BeforeClass(groups = { "sanity", "regression", "master" })
	@Parameters({ "os", "browser" })
	public void setup(String os, String br) throws IOException

	{
		// loading properties file
		FileReader file = new FileReader(".//src//test//resources//config.properties");
		p = new Properties();
		p.load(file);

		// loading log4j
		logger = LogManager.getLogger(this.getClass());// Log4j

		if (p.getProperty("execution_env").equalsIgnoreCase("remote")) {
			DesiredCapabilities capabilities = new DesiredCapabilities();

			// os
			if (os.equalsIgnoreCase("windows")) {
				capabilities.setPlatform(Platform.WIN10);
			} else if (os.equalsIgnoreCase("mac")) {
				capabilities.setPlatform(Platform.MAC);
			} else {
				System.out.println("No matching os");
				return;
			}

			// browser
			switch (br.toLowerCase()) {
			case "chrome":
				capabilities.setBrowserName("chrome");
				break;
			case "edge":
				capabilities.setBrowserName("MicrosoftEdge");
				break;
			default:
				System.out.println("No matching browser");
				return;
			}

			wd = new RemoteWebDriver(new java.net.URL("http://localhost:4444/wd/hub"), capabilities);
		}

		if (p.getProperty("execution_env").equalsIgnoreCase("local")) {

			switch (br.toLowerCase()) {
			case "chrome":
				wd = new ChromeDriver();
				break;
			case "edge":
				wd = new EdgeDriver();
				break;
			case "firefox":
				wd = new FirefoxDriver();
				break;
			default:
				System.out.println("Invalid browser name..");
				return;
			}
		}

		// launching browser based on condition

		wd.manage().deleteAllCookies();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		wd.get(p.getProperty("opencartURL"));
		wd.manage().window().maximize();
	}

	@AfterClass(groups = { "sanity", "regression", "master" })
	public void tearDown() {
		wd.quit();
	}

	public String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}

	public String randomNumber() {
		String generatedString = RandomStringUtils.randomNumeric(10);
		return generatedString;
	}

	public String randomAlphaNumeric() {
		String str = RandomStringUtils.randomAlphabetic(3);
		String num = RandomStringUtils.randomNumeric(3);

		return (str + "@" + num);
	}

	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		TakesScreenshot takesScreenshot = (TakesScreenshot) wd;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

		String targetFilePath = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile = new File(targetFilePath);

		sourceFile.renameTo(targetFile);

		return targetFilePath;

	}

}
