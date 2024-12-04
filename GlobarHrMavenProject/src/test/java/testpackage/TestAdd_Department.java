package testpackage;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import generics.BaseTest;
import generics.Flib;
import pagepackage.Add_Department;

public class TestAdd_Department extends BaseTest {
	
	
	
	
	@Test
	public void testfilldepartmentform() throws IOException, InterruptedException, AWTException
	{
		
		
			
		Flib flib = new Flib();
		Add_Department adddepartment = new Add_Department(driver);
		adddepartment.validloginToGlobalHr(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		adddepartment.fillDepartmentForm();
		
		
		
		
	
		
	}

}
