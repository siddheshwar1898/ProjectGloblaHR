package generics;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.google.common.io.Files;


public class WebDriverCommonLib extends BaseTest {
	
	public void mouseHoveronWebElement(WebElement target)
	{
		Actions act = new Actions(driver);
	    act.moveToElement(target).build().perform();
	}
	


	public void delay(int milisecond) throws InterruptedException
	{
		Thread.sleep(milisecond);
	}


	public void selectTheOptionsOfDrodown(WebElement element,int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectTheOptionsOfDrodown(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	public void selectTheOptionsOfDrodown(String visibleText,WebElement element)
	{
		Select sel = new Select(element);
		sel.selectByValue(visibleText);
	}
	
	
	public void scrollDown(int pixels)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+pixels+")");
	}
	
	public void takesScreenshots(String image) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(SCREENSHOT_PATH+image);
		Files.copy(src, dest);
		
	}
	
	
	public  void pressTab() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
	}
	
	public void hitTheEnterButton() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}



	
	
	
}
