package pagepackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import bsh.util.Util;
import generics.BaseTest;
import generics.WebDriverCommonLib;

public class Add_Department extends BaseTest{

	@FindBy(id = "username") WebElement usn;
	@FindBy(name = "password") WebElement pass;
	@FindBy(name="submit") WebElement loginbutton;
	@FindBy(xpath = "//a[@title='Work Shift And Rota']") WebElement workshiftandRota;
	@FindBy(xpath = "//a[@title='Department']") WebElement departement;
	@FindBy(xpath = "//i[@class='fa fa-plus-circle fa-fw']") WebElement addDepartmentBtn;
	@FindBy(xpath = "(//input[@class='form-control '])[2]")  WebElement masterCode;
	@FindBy(xpath = "(//input[@class='form-control '])[3]") WebElement masterName;
	@FindBy(xpath = "//textarea[@id='master_desc']") WebElement description;
	@FindBy(xpath = "(//select[@class='custom-select '])[2]") WebElement country;
	@FindBy(xpath = "(//button[@type='submit'])[3]") WebElement saveButton;
	//@FindBy(xpath = "(//span[@title='Edit'])[1]") WebElement editIcon;
	@FindBy(xpath = "//i[@class='fa fa-arrow-right fa-stack-1x']/ancestor::a") WebElement exportButton;
	@FindBy(xpath = "//a[@class='dropdown-item export-csv']") WebElement csvButton;
	@FindBy(xpath = "//a[@class='dropdown-item export-excel']") WebElement excelButton;
	@FindBy(xpath = "//a[@class='dropdown-item export-pdf']") WebElement pdfButton;
	@FindBy(xpath = "//a[@class='dropdown-item print']") WebElement printButton;
	@FindBy(xpath = "//i[@class='fa fa-cog fa-fw']") WebElement configurationButton;
    @FindBy(xpath = "(//label[@class='custom-control custom-checkbox'])[2]") WebElement listviewvisibleCheckBox;
	@FindBy(xpath = "(//button[@type='submit'])[2]") WebElement saveChangesButton;
    
    
    
    // constructor

	public Add_Department(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	public void validloginToGlobalHr(String username,String password)
	{
		usn.sendKeys(username); 
		pass.sendKeys(password);
		loginbutton.click();

	}

	public void fillDepartmentForm() throws InterruptedException, AWTException
	{

		try {

			System.out.println("*******Staring Test case of Add Department form fillup********");
			WebDriverCommonLib wdc = new WebDriverCommonLib();
			wdc.mouseHoveronWebElement(workshiftandRota);
			wdc.delay(2000);
			departement.click();
			wdc.delay(2000);
			addDepartmentBtn.click(); 
			wdc.delay(2000);
			masterCode.sendKeys("GVI11");
			wdc.delay(2000);
			masterName.sendKeys("Temotesting13");
			wdc.delay(2000);
			description.sendKeys("Department namee");
			wdc.delay(2000);
			wdc.selectTheOptionsOfDrodown(country, 1);
			wdc.delay(2000);
			saveButton.click();
			
			
			wdc.delay(5000);
			exportButton.click();
			wdc.delay(2000);
			csvButton.click();
			wdc.delay(2000);
			exportButton.click();
			wdc.delay(2000);
			pdfButton.click();
			wdc.delay(2000);
			exportButton.click();
			wdc.delay(2000);

			printButton.click();
			wdc.delay(20000);
			wdc.pressTab();
			System.out.println("switch the tab and cancel button");
			wdc.hitTheEnterButton();
			wdc.delay(2000);
			configurationButton.click();
			wdc.delay(2000);
			listviewvisibleCheckBox.click();
			wdc.delay(2000);
			
			wdc.scrollDown(2000);
			saveChangesButton.click();
			wdc.delay(2000);
		
			
			//Robot robot = new Robot();
			//robot.keyPress(KeyEvent.VK_TAB);
			//robot.keyRelease(KeyEvent.VK_TAB);
			
			//wdc.delay(2000);
			/*Robot robot1 = new Robot();
			robot1.keyPress(KeyEvent.VK_ENTER);
			robot1.keyRelease(KeyEvent.VK_ENTER);*/
			System.out.println("*******Finished Test case of Add Department form fillUp*****");


		}

		catch (Exception e) 
		{
              
		}




	}







}
