package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import generics.Flib;
import pagepackage.Add_Device_ProcessFiles;

public class TestAdd_Device_ProcessFiles extends BaseTest {
	
	
	
	
	@Test
	public void testdeviceProcessFiles() throws IOException, InterruptedException
	{
		 Flib flib = new Flib();
		Add_Device_ProcessFiles deviceprocessfiles = new Add_Device_ProcessFiles(driver);
		deviceprocessfiles.validLoginToGlobalHr(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
	    deviceprocessfiles.filldevicesProcessfilesform();
	
	}

}
