package com.CRM.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
public class BaseClass {
	
	public WebDriver driver;
	public HomePage hp;
	public LoginPage lp;
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@BeforeTest
	public void setup()
	{
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://automationplayground.com/crm/");
	hp=new HomePage(driver);
	lp=new LoginPage(driver); //It will create issue as we need to use this after home page execution  as login must be open 
	}

}
