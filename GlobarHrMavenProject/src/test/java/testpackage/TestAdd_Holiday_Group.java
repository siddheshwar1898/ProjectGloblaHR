package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import generics.Flib;
import pagepackage.Add_Holiday_Group;
import pagepackage.Edit;

public class TestAdd_Holiday_Group extends BaseTest {
	
	
	@Test
	public void testaddholidaygroup() throws IOException, InterruptedException
	{
		Flib flib = new Flib();
		Add_Holiday_Group addholiday = new Add_Holiday_Group(driver);
		addholiday.validlogintoglobalHr(flib.readPropertyData(PROP_PATH,"username"),flib.readPropertyData(PROP_PATH, "password"));
		
		addholiday.fillholidaygroupform();
		//Edit edt = new Edit(driver);
		//edt.edit();
		
	
		
		
		
	
		
		
		
		
	}
	
	
	

}
