package com.newtvsm.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {
	
	WebDriver driver;
	
	public WaitUtil(WebDriver driver)
	{
		this.driver=driver;
		
	}

	public void waitFormilliSeconds(long waitTime)
	{
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void waitForSeconds(long waitTime)
	{
		
		waitFormilliSeconds(1000*waitTime);
	}
	
	
public void implicitWait(WebDriver driver,long waitTime)
{
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));
}

public void explicitWait(WebDriver driver,long waitTime,  ExpectedCondition<?> expCon)
{
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(waitTime));
	wait.until(expCon);
	
	
}
}
