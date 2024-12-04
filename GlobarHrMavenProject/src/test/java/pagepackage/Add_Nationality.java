package pagepackage;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import generics.BaseTest;
import generics.WebDriverCommonLib;

public class Add_Nationality extends BaseTest {



	@FindBy(id = "username") WebElement usn;
	@FindBy(name = "password") WebElement pass;
	@FindBy(name="submit") WebElement loginbutton;
	@FindBy(xpath = "//a[contains(@title,'Employee Hub')]") WebElement employeeHub;
	@FindBy(xpath = "//a[@title='Nationality']") WebElement nationality;
	@FindBy(xpath = "//i[@class='fa fa-plus-circle fa-fw']") WebElement addbtn;
	
	@FindBy(xpath = "//select[@class='custom-select ' and @id='empId']") WebElement employeeFullName;
	@FindBy(xpath = "//select[@class='custom-select ' and @id='CNTCT_NATIONALITY_ID']") WebElement contactNationality;
	@FindBy(xpath = "(//button[@type='submit'])[3]") WebElement saveBtn;
	@FindBy(xpath = "//a[@role='button']") WebElement cancelButton;


	public Add_Nationality(WebDriver driver)
	{	
		PageFactory.initElements(driver, this);
	}




	public void validlogintoglobalHr(String username, String password)
	{

		usn.sendKeys(username);
		pass.sendKeys(password);
		loginbutton.click();
	}

	public void fillNationalityform() throws InterruptedException
	{

		WebDriverCommonLib wdc = new WebDriverCommonLib();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		String actualTitle = driver.getTitle();
		System.out.println("Title of the page : "+actualTitle);
		Reporter.log(actualTitle,true);



		Assert.assertEquals(actualTitle.contains("Dashboard"),true);

		wdc.mouseHoveronWebElement(employeeHub);
		Thread.sleep(2000);
		nationality.click();
		Thread.sleep(2000);
		addbtn.click();
	//	requrestedByDrowndown.click();
	
		
		
		Thread.sleep(2000);
		wdc.selectTheOptionsOfDrodown(employeeFullName, "1693");
		Thread.sleep(2000);
		wdc.selectTheOptionsOfDrodown(contactNationality,"216" );
	    saveBtn.click();
	    Thread.sleep(8000);

		//cancelButton.click();
	   // driver.navigate().refresh();
	    Thread.sleep(8000);


		

	}











}
