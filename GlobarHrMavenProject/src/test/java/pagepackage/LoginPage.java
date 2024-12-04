package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BaseTest;
import generics.WebDriverCommonLib;

public class LoginPage
{

	// declare locator present on loginpage
	@FindBy(id = "username") WebElement usn;
	@FindBy(name = "password") WebElement pass;
	@FindBy(name="submit") WebElement loginbutton;
	@FindBy(xpath = "//a[contains(@title,'Employee Hub')]") WebElement employeeHub;
    @FindBy(xpath = "//li[@class='nav-sub-item']/descendant::a[@title='Work Locations']") WebElement worklocation;
    @FindBy(xpath="//i[@class='fa fa-plus-circle fa-fw']/ancestor::a") WebElement addbutton;
    @FindBy(xpath = "(//select[@class='custom-select '])[1]") WebElement seldropdown;
    @FindBy(xpath = "(//select[@class='custom-select '])[2]") WebElement seldropdown2;
    @FindBy(xpath = "(//button[@type='submit'])[3]") WebElement submitbutton;
    
    //initialize constructor 
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public void  validLogintoGlobalHr(String username, String password)
	{

		usn.sendKeys(username);
		pass.sendKeys(password);
		loginbutton.click();
	
	}

	
	public void genericReusableMethod() throws InterruptedException
	{
		
		WebDriverCommonLib wdc = new WebDriverCommonLib();
		wdc.mouseHoveronWebElement(employeeHub);
		worklocation.click();
		wdc.delay(3000);
		addbutton.click();
		wdc.selectTheOptionsOfDrodown(seldropdown, "1616");
		wdc.delay(3000);
		wdc.selectTheOptionsOfDrodown(seldropdown2,5);
		wdc.delay(3000);
		submitbutton.click();
		wdc.delay(3000);
		
	}

	
	



}

