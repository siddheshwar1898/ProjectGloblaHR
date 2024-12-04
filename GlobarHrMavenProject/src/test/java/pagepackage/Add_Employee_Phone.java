package pagepackage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BaseTest;
import generics.WebDriverCommonLib;

public class Add_Employee_Phone extends BaseTest {
	
	
	@FindBy(id = "username") WebElement usn;
	@FindBy(name = "password") WebElement pass;
	@FindBy(name="submit") WebElement loginbutton;
	@FindBy(xpath = "//a[contains(@title,'Employee Hub')]") WebElement employeeHub;
	@FindBy(xpath = "//a[@title='Employee Phone']") WebElement employeePhone;
	@FindBy(xpath = "//i[@class='fa fa-plus-circle fa-fw']") WebElement addEmpPhonebtn;
	@FindBy(xpath = "//select[@name='empId']") WebElement empFullName;
	@FindBy(xpath = "//select[@name='COUNTRY_CODE']") WebElement officecode;
	@FindBy(xpath = "//input[@id='cntct_phone_id']") WebElement officeNumber;
	@FindBy(xpath = "//input[contains(@name,'EMP_phone')]") WebElement empPhone;
	@FindBy(xpath = "//select[@name='phone_typ']") WebElement PhoneType;
	@FindBy(xpath = "//a[@role='button']") WebElement cancelBtn;
	@FindBy(xpath = "//button[@type='submit' and @id='main' and text()='Save']") WebElement saveBtn;
	
	
	public Add_Employee_Phone(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void validlogintoglobalHr(String username, String password)
	{
		usn.sendKeys(username);
		pass.sendKeys(password);
		loginbutton.click();
	}
	
	public void fillempphoneNumber() throws InterruptedException
	{
		WebDriverCommonLib wdc = new WebDriverCommonLib();
		
		String title = driver.getTitle();
		System.out.println("Title of the page : "+title);
	
		wdc.mouseHoveronWebElement(employeeHub);
		employeePhone.click();
		wdc.delay(2000);
		addEmpPhonebtn.click();
		wdc.selectTheOptionsOfDrodown(empFullName, "1693");
		wdc.delay(2000);
		wdc.selectTheOptionsOfDrodown(officecode, "3814");
		wdc.delay(2000);
		officeNumber.sendKeys("02472221570");
		empPhone.sendKeys("9158591716");
		wdc.delay(2000);
		wdc.selectTheOptionsOfDrodown(PhoneType, "620");
		wdc.delay(2000);
		cancelBtn.click();
		wdc.delay(2000);
		
		//saveBtn.click();
		//wdc.delay(2000);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
