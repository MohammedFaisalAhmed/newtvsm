package com.newtvsm.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebElementUIHelperUtil {
	
	WebDriver driver;
	WaitUtil waitUtil;
	
	public WebElementUIHelperUtil(WebDriver driver)
	{
	this.driver=driver;	
	this.waitUtil = new WaitUtil(driver);
		
	}
	
	public void clickWithImplicitWait(WebElement webElement)
	{
		
		waitUtil.implicitWait(driver, 30);
		scrollToElement(webElement);
		webElement.click();
	}
	
	public void clickWithExplicitWait(WebElement webElement)
	{
		
		waitUtil.explicitWait(driver, 30, ExpectedConditions.elementToBeClickable(webElement));
		scrollToElement(webElement);
		webElement.click();
	}
	
	public void scrollToElement(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scollBy(0,700);");
		
	}

	
}
