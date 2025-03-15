package com.newtvsm.pageactions;

import org.openqa.selenium.WebDriver;

import com.newtvsm.pageobjects.HomePage;

public class HomePageActions {
	
	HomePage homePage;
	
	public HomePageActions(WebDriver driver)
	{
		
		this.homePage = new HomePage(driver);
	}
	
	public void clickProducts()
	{
		
		homePage.getProducts().click();
		
		
	}

}
