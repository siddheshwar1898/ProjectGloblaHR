package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.WebDriverCommonLib;

public class Work_Experiance {
	
	@FindBy(xpath = "//a[@title='Employee Hub']") WebElement employeeHub;
	@FindBy(xpath = "//a[@title='Work Experience']") WebElement workExperience;
    @FindBy(xpath = "//i[@class='fa fa-plus-circle fa-fw']") WebElement addbtn;
	@FindBy(xpath = "(//select[@class='custom-select '])[1]") WebElement fullname;
	@FindBy(xpath = "//input[@id='eexpSeqno']") WebElement  expseqnumber;
	@FindBy(xpath = "//input[@id='eexpEmployer']") WebElement employerName;
	@FindBy(xpath = "(//select[@class='custom-select '])[2]") WebElement jobRole;
	@FindBy(xpath = "//input[@name='jobTitle']") WebElement jobTitle;
	@FindBy(id = "eexpComments")  WebElement expComment;
	@FindBy(xpath = "//a[@role='button']") WebElement cancelBtn;
	@FindBy(xpath = "//button[@fdprocessedid='qmpr3j']") WebElement saveBtn;
	
	
	public Work_Experiance(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}
	
	
	
	public void fillExperienceFormDetails() throws InterruptedException
	{
		
	WebDriverCommonLib wdc = new WebDriverCommonLib();
	wdc.mouseHoveronWebElement(employeeHub);
	wdc.delay(2000);
	workExperience.click();
	wdc.delay(2000);
	addbtn.click();
	fullname.click();
	wdc.delay(2000);
	wdc.selectTheOptionsOfDrodown(fullname, "1693");
	wdc.delay(2000);
	expseqnumber.sendKeys("123");
	employerName.sendKeys("Namdas");
	wdc.selectTheOptionsOfDrodown(jobRole, "49789");
	wdc.delay(2000);
	wdc.scrollDown(1000);
	jobTitle.sendKeys("Software Test Engineer");
	expComment.sendKeys("Hands-On Experience");
	cancelBtn.click();
	wdc.delay(2000);
	//saveBtn.click();
   // wdc.delay(2000);
    
	
	
	
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
