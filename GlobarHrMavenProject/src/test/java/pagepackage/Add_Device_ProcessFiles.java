package pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import generics.BaseTest;
import generics.WebDriverCommonLib;

public class Add_Device_ProcessFiles  extends BaseTest{

	//declaration all locators

	@FindBy(id = "username") WebElement usn;
	@FindBy(name = "password") WebElement pass;
	@FindBy(name="submit") WebElement loginbutton;
	@FindBy(xpath = "//a[@title='Device Manager']") WebElement deviceManager;
	@FindBy(xpath = "//a[contains(@title,'Device Process File')]") WebElement deviceProcessFiles;
	@FindBy(xpath = "//i[@class='fa fa-plus-circle fa-fw']") WebElement adddeviceProcessFiles;
	@FindBy(xpath = "//select[@name='user']") WebElement requestedByDropdown;
	@FindBy(xpath = "//input[@name='employeeCode']") WebElement employeeCode;
	@FindBy(xpath = "//input[@id='employeeName']") WebElement employeeName;
	@FindBy(xpath = "//input[@id='company']") WebElement company;
	@FindBy(xpath = "//input[@id='department']") WebElement departMent;
	@FindBy(xpath = "//input[@id='lastPunch']") WebElement lastPunch;
	@FindBy(xpath = "//input[@id='direction']") WebElement direction;
	@FindBy(xpath = "//input[@id='punchRecord']") WebElement punchRecord;
	@FindBy(xpath = "//input[@id='status']") WebElement status;
	@FindBy(xpath = "(//button[@type='submit'])[3]") WebElement saveButton;
	@FindBy(xpath = "//i[@class='fa fa-arrow-right fa-stack-1x']") WebElement exportButton;
	@FindBy(xpath = "//i[@class='fa fa-lg fa-fw fa-file-text-o']/ancestor::a[@class]") WebElement csvBtn;
	@FindBy(xpath = "//a[@class='dropdown-item export-excel']") WebElement excelBtn;
	@FindBy(xpath = "//a[@class='dropdown-item export-pdf']") WebElement pdfBtn;
	@FindBy(xpath = "//a[@class='dropdown-item print']") WebElement print;
	@FindBy(xpath = "//i[@class='fa fa-cog fa-fw']") WebElement configurationBtn;
	@FindBy(xpath = "(//label[@class='custom-control custom-checkbox'])[2]") WebElement listViewVisible;
	@FindBy(xpath = "(//label[@class='custom-control custom-checkbox'])[3]") WebElement formViewVisible;
	@FindBy(xpath = "(//button[@type='submit'])[2]") WebElement saveChangesButton;
	@FindBy(xpath = "//select[@name='DataTables_Table_0_length']") WebElement recordsperPage;
	@FindBy(xpath = "(//span[@title='Edit'])[1]") WebElement editIcon;

	//constructor

	public Add_Device_ProcessFiles(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public void validLoginToGlobalHr(String username,String password)
	{
		usn.sendKeys(username);
		pass.sendKeys(password);
		loginbutton.click();

	}

	public void filldevicesProcessfilesform() throws InterruptedException
	{

		try 
		{
			Reporter.log("*******Starting Tast Case**********",true);

			WebDriverCommonLib wdc = new WebDriverCommonLib();

			/// verification
			String actualTitleOfThePage = driver.getTitle();
			Reporter.log(actualTitleOfThePage+" :is a Actual Title of the Page",true);
			Assert.assertTrue(true);

			//mouserHoverOn The WebElement
			wdc.mouseHoveronWebElement(deviceManager);

			//gives delay in ms for stop execution of few seconds
			Thread.sleep(2000);

			//click On the device Processe Files SubModule
			deviceProcessFiles.click();
			Thread.sleep(2000);

			//click on Add Device Process Files Button
			adddeviceProcessFiles.click();

			//select options From dropDown by using Select By value
			//wdc.selectTheOptionsOfDrodown(requestedByDropdown, "3318");
			Thread.sleep(2000);

			//send text to the Employee Code txtbox field
			employeeCode.sendKeys("EMPNO58742");
			Thread.sleep(2000);

			//send text to the Employee Name txtbox field
			employeeName.sendKeys("Vishal B Nam");
			Thread.sleep(2000);

			//send text to the Company txtbox field
			company.sendKeys("Geecon India pvt ltd");
			Thread.sleep(2000);

			//send text to the department txtbox field
			departMent.sendKeys("TEsting");
			Thread.sleep(2000);

			//send text to the lastpunch txtbox field
			lastPunch.sendKeys("12:00 pm");
			Thread.sleep(2000);

			//send text to the direction txtbox field
			direction.sendKeys("right direction");
			Thread.sleep(2000);

			//send text to the punchRecord txtbox field
			punchRecord.sendKeys("9 Hours per day");
			Thread.sleep(2000);

			//send text to the status txtbox field
			status.sendKeys("Done");
			Thread.sleep(2000);

			//Click on the Save Button
			saveButton.click();
			Thread.sleep(2000);

			//click on export and csv files
			exportButton.click();
			Thread.sleep(2000);
			csvBtn.click();
			Thread.sleep(2000);

			//click on export and excelfile button 
			exportButton.click();
			Thread.sleep(2000);
			excelBtn.click();
			Thread.sleep(2000);


			//click on export and pdf files button
			exportButton.click();
			Thread.sleep(2000);
			pdfBtn.click();
			Thread.sleep(2000);
			//click on export button and print 
			exportButton.click();
			Thread.sleep(2000);
			print.click();
			Thread.sleep(2000);


			//press the tab 
			wdc.pressTab();
			Thread.sleep(2000);
			wdc.hitTheEnterButton();
			Thread.sleep(2000);

			//click on configuration Button 
			configurationBtn.click();
			Thread.sleep(2000);


			//select the list view visible checkboxes
			listViewVisible.click();
			boolean list = listViewVisible.isSelected();
			System.out.println(list+"is checkbox is selected");

			//select the Form view visible checkboxes
			formViewVisible.click();
			boolean form = formViewVisible.isSelected();
			System.out.println(form+"is chebox is selected");

			//scroll Down by 1000 pixels
			wdc.scrollDown(1000);

			// click on save the changes button
			saveChangesButton.click();
			Thread.sleep(2000);

			//select the options from records per page dropdown list
			recordsperPage.click();
			wdc.selectTheOptionsOfDrodown(recordsperPage, "25");
			Thread.sleep(5000);

			//click on Edit icon
			editIcon.click();
			Thread.sleep(2000);
			employeeName.clear();
			Thread.sleep(2000);

			//send new employee name to textbox fields
			employeeName.sendKeys("Siddheshwar Namdas");
			Thread.sleep(2000);
		
			
			//click on saveButton
			saveButton.click();
			Thread.sleep(2000);


			Reporter.log("**********Finished The Test Case**********",true);

		}

		catch(Exception e)
		{

		}






	}




}
