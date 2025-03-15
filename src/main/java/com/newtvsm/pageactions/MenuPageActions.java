package com.newtvsm.pageactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.newtvsm.pageobjects.MenuPage;
import com.newtvsm.utilities.WebElementUIHelperUtil;

public class MenuPageActions {
	
	
	MenuPage menuPage;
	WebElementUIHelperUtil webElementUIHelperUtil;
	
	public MenuPageActions(WebDriver driver) 
	{
		this.menuPage = new MenuPage(driver);
		this.webElementUIHelperUtil = new WebElementUIHelperUtil(driver);
		
	}
	
	public void clickVehicleModel(String vehicleModel) {
		
		
		webElementUIHelperUtil.clickWithImplicitWait(menuPage.getVehicleModel(vehicleModel));
	}
	
	public void clickVehicles(String vehicleModels)
	{
		webElementUIHelperUtil.clickWithExplicitWait(menuPage.getVehicles(vehicleModels));
	}
	
	
	public void verifyAllVehicles()
	{
		
		
		for(WebElement element: menuPage.getAllVehiclesLocator() )
		{
			
			element.getText();
			//to be implemented when Json we implement
			
		}
	}
	

}
