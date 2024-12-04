package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import generics.Flib;
import pagepackage.Add_Employee_Licence;

public class TestAdd_Emp_Licese extends BaseTest

{

	@Test
	public void testemplicensedetails() throws IOException, InterruptedException
	{
		Flib flib = new Flib();
		Add_Employee_Licence addemplicence = new Add_Employee_Licence(driver);
		addemplicence.validlogintoGlobalhr(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		addemplicence.fillempLicenceDetails();
		
		
	}
	
	
	
}
