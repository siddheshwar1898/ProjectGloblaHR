package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import generics.Flib;
import pagepackage.Add_Nationality;

public class TestAdd_Nationality extends BaseTest {
	
	
	@Test
	public void fillNationalityform() throws IOException, InterruptedException
	{
		Flib flib = new Flib();
		Add_Nationality addNationality = new Add_Nationality(driver);
		addNationality.validlogintoglobalHr(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH,"password"));
		addNationality.fillNationalityform();
		
		
	}
		

}
