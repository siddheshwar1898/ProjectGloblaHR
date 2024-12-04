package generics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;


public class BaseTest implements IAutoConstant {
	protected static WebDriver driver;

	@BeforeMethod
	public void setUp() throws IOException
	{

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");

		if (browserValue.equalsIgnoreCase("chrome")) 
		{
			driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
			driver.get(url);
		}

		else if (browserValue.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);

		}


		else 
		{
			System.out.println("Invalid browser name");
		}

	}





	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
