package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BaseTest;
import generics.WebDriverCommonLib;

public class Add_Rota_Pattern_Name extends BaseTest  {

	//declare all the locator
	@FindBy(id = "username") WebElement usn;
	@FindBy(name = "password") WebElement pass;
	@FindBy(name="submit") WebElement loginbutton;
	@FindBy(xpath = "//a[@title='Work Shift And Rota']") WebElement workshiftandrota;
	@FindBy(xpath = "//a[@title='Rota Pattern Name']") WebElement rotaPatternName;
	@FindBy(xpath = "//i[@class='fa fa-plus-circle fa-fw']") WebElement addBtn;
	@FindBy(xpath = "//select[@name='user']") WebElement requestedBy;
	@FindBy(xpath = "(//input[@class='form-control '])[2]") WebElement masterCode;
	@FindBy(xpath = "//input[@name='master_name']") WebElement masterName;
	@FindBy(xpath = "//textarea[@name='master_desc']") WebElement descriptiontxtbox;
	@FindBy(xpath = "(//button[@type='submit'])[3]") WebElement savebuttn;
	@FindBy(xpath = "//i[@class='fa fa-arrow-right fa-stack-1x']") WebElement exportbuttn;
	@FindBy(xpath = "//a[@class='dropdown-item export-csv']") WebElement csv;
	@FindBy(xpath = "//a[@class='dropdown-item export-excel']") WebElement excel;
	@FindBy(xpath = "//a[@class='dropdown-item export-pdf']") WebElement pdf;


	public Add_Rota_Pattern_Name(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}




	public void validloginToGlobalhr(String username, String password)
	{
		usn.sendKeys(username);
		pass.sendKeys(password);
		loginbutton.click();

	}


	public void fillRotaPatterName() throws InterruptedException
	{

		try 
		{

			System.out.println("********Starting Test Case******");
			WebDriverCommonLib wdc = new WebDriverCommonLib();
			wdc.mouseHoveronWebElement(workshiftandrota);
			rotaPatternName.click();
			wdc.delay(2000);
			addBtn.click();

			masterCode.sendKeys("mTestdemo1");
			wdc.delay(2000);
			masterName.sendKeys("Demon11");
			descriptiontxtbox.sendKeys("descriptionf or rotamodule");
			savebuttn.click();
			wdc.delay(2000);
			System.out.println("******Finished Test Case********");

		}
		catch(Exception e)
		{

		}



	}























}
