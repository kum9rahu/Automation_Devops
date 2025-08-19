package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//Encapsulation =private data + public Method
	private WebDriver driver;
	
	//initialize driver using Constructor
	
	public LoginPage(WebDriver driver)  //base class session driver 
	{
		this.driver=driver;            //initialize to current (this class ) driver
	}
	
	//data member(Locator)
	private By email= By.id("email-id");
	private By pswd= By.id("password");
	private By submt= By.id("submit-id");
	
	//Method 
	public String doLogin(String em,String ps)
	{
		driver.findElement(email).sendKeys(em);
		driver.findElement(pswd).sendKeys(ps);
		driver.findElement(submt).submit();
		return driver.getCurrentUrl();
	}
}
