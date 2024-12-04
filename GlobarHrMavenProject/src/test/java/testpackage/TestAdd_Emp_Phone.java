package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import generics.Flib;
import pagepackage.Add_Employee_Phone;


public class TestAdd_Emp_Phone extends BaseTest {
	
	
	
	@Test
	public void test_empphone_Number() throws IOException, InterruptedException
	{
		Flib flib = new Flib();
		Add_Employee_Phone addempPhone = new Add_Employee_Phone(driver);
	    addempPhone.validlogintoglobalHr(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
		
	   //method calling 
	    addempPhone.fillempphoneNumber();
	    
		
	}
	
	
	

}
