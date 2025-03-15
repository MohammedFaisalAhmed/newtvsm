package com.newtvsm.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.newtvsm.utilities.WaitUtil;

public class MenuPage {
	
	WebDriver driver;
	WebDriverWait wait; 
	
	@FindBy(xpath ="//div[@class=\"product-wrap-lg\"]/h3[contains(text(),'All')]/following-sibling::ul//span")
	List<WebElement> allVehiclesLocator ;
	
  public MenuPage(WebDriver driver)
  {
	  
	  this.driver=driver;
  }
  
  public WebElement getVehicleModel(String vehicleModel)
  {
	  
	  By getVehicleModelLocator =By.xpath("//ul[@class='leftTabNav']//a[text()='"+vehicleModel+"]");
	  return wait.until(ExpectedConditions.presenceOfElementLocated(getVehicleModelLocator));
  }

  public WebDriver getDriver() {
	return driver;
}

public void setDriver(WebDriver driver) {
	this.driver = driver;
}

public List<WebElement> getAllVehiclesLocator() {
	return allVehiclesLocator;
}

public void setAllVehiclesLocator(List<WebElement> allVehiclesLocator) {
	this.allVehiclesLocator = allVehiclesLocator;
}

public WebElement getVehicles(String vehicleModels)
  {
	  
	  By getVehiclesLocator = By.xpath("//div[@class=\"product-wrap-lg\"]//span[text()=\'"+vehicleModels+"']");
	  return wait.until(ExpectedConditions.presenceOfElementLocated(getVehiclesLocator));
			  
  }
  
  
}
