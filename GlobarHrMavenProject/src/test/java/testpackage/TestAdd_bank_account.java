package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import generics.Flib;
import pagepackage.Add_Bank_Account;
import pagepackage.LoginPage;

public class TestAdd_bank_account extends BaseTest {

	@Test
	public void testaddbankaccount() throws IOException, InterruptedException
	{
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.validLogintoGlobalHr(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		
		Add_Bank_Account add = new Add_Bank_Account(driver);
		add.fillnewBankAccountDetails();
	}


}
