package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	//Encapsulation =private data + public Method
	
	private WebDriver driver;
	
	//initialize driver
	
	//obJECT INTIALIAZATION through constructor 
	public HomePage(WebDriver driver)  //base class driver 
	{
		this.driver=driver;   //initialize to current (this class ) driver
	}
	
	//data member(Locator)
	
	private By link=By.linkText("Sign In");
	
	//Method(Functionality to test)
	
	public String getAppUrl()
	{
	return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
	return driver.getTitle();
	}
	public String getStatusOfLink()
	{
		driver.findElement(link).click();
		return driver.getCurrentUrl();
		
	}

}
