package pagepackage;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BaseTest;
import generics.WebDriverCommonLib;

public class Add_Holiday_Group extends BaseTest{

	//declare all the locator
	@FindBy(id = "username") WebElement usn;
	@FindBy(name = "password") WebElement pass;
	@FindBy(name="submit") WebElement loginbutton;
	@FindBy(xpath = "(//img[@class='leftmenuicons'])[26]/ancestor::a") WebElement holidayManager;
	@FindBy(xpath = "//a[@title='Holiday Group Master']") WebElement holidayGroupMaster;
	@FindBy(xpath = "//i[@class='fa fa-plus-circle fa-fw']") WebElement addholidaygroup;
	@FindBy(xpath = "//select[@name='user']") WebElement requestedBy;
	@FindBy(id = "master_code") WebElement masterCode;
	@FindBy(xpath = "//input[@name='master_name']") WebElement masterName;
	@FindBy(xpath = "//textarea[@class='form-control ']") WebElement descriptiontxt;
	@FindBy(xpath = "(//select[@class='custom-select '])[2]") WebElement country;
	@FindBy(xpath = "//button[@type='submit' and @id='main']") WebElement saveBtn;
	@FindBy(xpath = "(//span[@class='fa fa-edit fa-1xx'])[3]/ancestor::a") WebElement editIcon;
	@FindBy(xpath = "(//button[@name='next'])[2]") WebElement savenaddBtn;
	@FindBy(xpath = "//a[@class='btn btn-sm btn-default cancelButton']") WebElement cancelBtn;
	@FindBy(xpath = "//i[@class='fa fa-arrow-right fa-stack-1x']") WebElement exportBtn;






	//constructor
	public Add_Holiday_Group(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}

	//valid login to HRMS DEV 
	public void validlogintoglobalHr(String username, String password)
	{
		usn.sendKeys(username);
		pass.sendKeys(password);
		loginbutton.click();
	}

	public void fillholidaygroupform() throws InterruptedException, IOException
	{


		WebDriverCommonLib wdc = new WebDriverCommonLib();


		wdc.mouseHoveronWebElement(holidayManager);
		Thread.sleep(2000);

		holidayGroupMaster.click();
		Thread.sleep(2000);


		addholidaygroup.click();


		Thread.sleep(2000);
		masterCode.sendKeys("Global125");
		boolean displayed = masterCode.isDisplayed();
		System.out.println(displayed);
		String text = masterCode.getText();
		System.out.println("Text : "+text);

		Thread.sleep(2000);

		masterName.sendKeys("Gspladmin143");

		Thread.sleep(5000);
		descriptiontxt.sendKeys("Raksha Bandhan");

		wdc.selectTheOptionsOfDrodown(country, 1);
		Thread.sleep(5000);

		saveBtn.click();



	}


}
