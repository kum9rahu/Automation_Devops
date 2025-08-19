package com.CRM.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.Pages.BaseClass;

public class HomeTestCase extends BaseClass
{
	@Test(priority =1)
	public void VerifyUrl()
	{
		//Need to Create  the object of the class which we want to call
		// HomePage hp=new HomePage();//scope here is local -so now we should object should be global 
		//and better define this in base class as we need this again and again in 2nd and 3rd test   			
		String actUrl= hp.getAppUrl();
		Assert.assertTrue(actUrl.contains("crm"),"Test Failed -Url is not Matched");
		System.out.println("Test Pass: Url Matched ");
	}

	@Test(priority =2)
	public void VerifyTitle() 
	{
		String actTitle= hp.getAppTitle();
		Assert.assertTrue(actTitle.contains("Customer"),"Test Failed -Title is not Matched");
		System.out.println("Test Pass: Title Matched ");
	}

	@Test(priority =3)
	public void VerifySignInLnk()
	{
		String actTitle= hp.getStatusOfLink();
		Assert.assertTrue(actTitle.contains("login"),"Test Failed -Title is not Matched");
		System.out.println("Test Pass: Title Matched ");
	}
}
