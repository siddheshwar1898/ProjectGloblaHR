package testpackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generics.BaseTest;
import generics.Flib;
import pagepackage.LoginPage;
import pagepackage.Work_Experiance;

public class TestAdd_work_experiance extends BaseTest
{

	@Test
	public void testaddworkExperiance() throws IOException, InterruptedException
	{
		 Flib flib = new Flib();
		 LoginPage lp = new LoginPage(driver);
		 lp.validLogintoGlobalHr(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		
		 Work_Experiance workexp = new Work_Experiance(driver);
		 workexp.fillExperienceFormDetails();
	}
	
	
	
	
}
