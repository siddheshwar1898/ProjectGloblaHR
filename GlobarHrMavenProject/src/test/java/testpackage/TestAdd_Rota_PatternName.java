package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import generics.Flib;
import pagepackage.Add_Rota_Pattern_Name;

public class TestAdd_Rota_PatternName extends BaseTest {

	@Test
	public void testRotaPatterName() throws IOException, InterruptedException
	{
		Flib flib = new Flib();
		Add_Rota_Pattern_Name rotapatternName = new Add_Rota_Pattern_Name(driver);
		rotapatternName.validloginToGlobalhr(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		/* String validusnn = flib.readPropertyData(PROP_PATH, "username");
             String validpas = flib.readPropertyData(PROP_PATH,"password");
             rotapatternName.validloginToGlobalhr(validusnn, validpas);*/
		     rotapatternName.fillRotaPatterName();


	}







}
