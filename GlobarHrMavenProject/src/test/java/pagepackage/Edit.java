package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.WebDriverCommonLib;

public class Edit {
	
	@FindBy(xpath = "(//span[@class='fa fa-edit fa-1xx'])[1]") WebElement editIcon;
	@FindBy(xpath = "//input[@name='master_name']") WebElement masterName;
	@FindBy(xpath = "(//button[@name='next'])[2]") WebElement savenaddBtn;
    @FindBy(xpath = "//a[@class='btn btn-sm btn-default cancelButton']") WebElement cancelBtn;
	
	
	
	public Edit(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void edit() throws InterruptedException 
	{
	   WebDriverCommonLib wdc = new WebDriverCommonLib();
	   editIcon.click();
	   wdc.delay(2000);
	   masterName.clear();
	   wdc.delay(2000);
	   masterName.sendKeys("demotestt");
	   savenaddBtn.click();
	   wdc.delay(2000);
	   cancelBtn.click();
	   wdc.delay(2000);
	}

}
