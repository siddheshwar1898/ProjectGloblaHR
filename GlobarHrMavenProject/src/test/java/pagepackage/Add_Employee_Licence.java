package pagepackage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BaseTest;
import generics.WebDriverCommonLib;

public class Add_Employee_Licence extends BaseTest{

	@FindBy(id = "username") WebElement usn;
	@FindBy(name = "password") WebElement pass;
	@FindBy(name="submit") WebElement loginbutton;
	//@FindBy(xpath = "//a[@title='Employee Hub']/ancestor::li") WebElement employeeHub1;
	@FindBy(xpath = "//a[contains(@title,'Employee Hub')]") WebElement employeeHub;
	@FindBy(xpath = "//a[@title='Employee Licence Detail']") WebElement empLicenceDetail;
	@FindBy(xpath = "//i[@class='fa fa-plus-circle fa-fw']") WebElement addbtn;
	@FindBy(xpath = "//select[@class='custom-select ' and @name='empId']") WebElement empfullName;
	@FindBy(xpath = "//select[@class='custom-select 'and @name='licemceType']") WebElement licenseType;
	@FindBy(xpath = "//select[@class='custom-select 'and @name='licemceTypenm']") WebElement licenseName;	
	@FindBy(css = "input[name='licenceNo']") WebElement licenceNo;
	@FindBy(xpath = "//button[@type='submit' and @id='main']")WebElement saveBtn;

	public Add_Employee_Licence(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}


	public void validlogintoGlobalhr(String username,String password) 
	{
		usn.sendKeys(username);
		pass.sendKeys(password);
		loginbutton.click();


	}

	public void fillempLicenceDetails() throws InterruptedException
	{

		try 
		{
			System.out.println("**********Starting TC*********");
			
			WebDriverCommonLib wdc = new WebDriverCommonLib();
			wdc.mouseHoveronWebElement(employeeHub);

			empLicenceDetail.click();
			Thread.sleep(2000);
			addbtn.click();
			Thread.sleep(2000);


			saveBtn.click();
			Thread.sleep(2000);

			wdc.selectTheOptionsOfDrodown(empfullName, "1693");
			Thread.sleep(2000);

			wdc.scrollDown(500);
			Thread.sleep(2000);
			wdc.selectTheOptionsOfDrodown(licenseType, "1537");
			Thread.sleep(2000);
			wdc.selectTheOptionsOfDrodown(licenseName, "6676");
			Thread.sleep(2000);
			licenceNo.sendKeys("LVMTR MH259073");
			Thread.sleep(2000);

			//cancelBtn.click();

			saveBtn.click();
			Thread.sleep(2000);
			System.out.println("**********Finished Test Case************");


		}


		catch(Exception e)
		{

		}


	}


}
