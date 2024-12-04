package testpackage;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generics.BaseTest;
import generics.Flib;
import generics.WebDriverCommonLib;
import pagepackage.LoginPage;

public class TestAdd_Location extends BaseTest
{

	@Test
	public void testaddlocation() throws IOException, InterruptedException
	{
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.validLogintoGlobalHr(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
	    lp.genericReusableMethod();
	    
		
		
	
		
		
		
	}
	
	
	
	
}
