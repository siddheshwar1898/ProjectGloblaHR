package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.WebDriverCommonLib;

public class Add_Bank_Account {

	//declare All Locators
	@FindBy(xpath = "//a[contains(@title,'Employee Hub')]") WebElement employeeHub;
	@FindBy(xpath = "//a[@title='Bank Accounts']") WebElement bankAccount;
	@FindBy(xpath = "//i[contains(@class,'fa fa-plus-circle fa-fw')]") WebElement addBankAccount;
	@FindBy(xpath = "//select[@class='custom-select ']") WebElement empnamedrodown;
	@FindBy(xpath = "(//input[@class='form-control '])[2]") WebElement bankName;
	@FindBy(xpath = "(//input[@class='form-control '])[3]") WebElement branchName;
	@FindBy(id = "branchAddress") WebElement branchAddress;
	
	@FindBy(name = "AccholderNm") WebElement accountHolderName;
	@FindBy(id = "sortCd") WebElement sortId;
	@FindBy(id = "AccNo") WebElement accountNumber;
	@FindBy(name = "ifscCd") WebElement ifscCode;
	@FindBy(xpath ="//a[@class='btn btn-sm btn-default cancelButton']") WebElement cancelButton;
	@FindBy(xpath = "(//button[@type='submit'])[3]")  WebElement saveButton;
	
	
	//initialize constructor with pagefatory
	public Add_Bank_Account(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
	}



	public void fillnewBankAccountDetails() throws InterruptedException
	{

		WebDriverCommonLib wdc = new WebDriverCommonLib();
		
		wdc.mouseHoveronWebElement(employeeHub);
		bankAccount.click();
		addBankAccount.click();
		wdc.delay(2000);
		wdc.selectTheOptionsOfDrodown( empnamedrodown,1);
		bankName.sendKeys("State Bank of India Bank");
		branchName.sendKeys("Anand Nager");
		branchAddress.sendKeys("dharashiv");
		wdc.delay(2000);
		accountHolderName.sendKeys("Siddheshwar b Namdas");
		wdc.scrollDown(1000);
		wdc.delay(2000);
		sortId.sendKeys("8545");
		wdc.delay(2000);
		
		accountNumber.sendKeys("123456891");
		ifscCode.sendKeys("1244");
		wdc.delay(2000);
		cancelButton.click();
		wdc.delay(5000);
		//saveButton.click();
		//wdc.delay(5000);
		










	}








}
