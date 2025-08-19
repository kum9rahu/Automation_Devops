package com.CRM.TestCase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.CRM.Pages.BaseClass;

public class LoginTestCase extends BaseClass 
{

	@BeforeClass
	public void PageSetup()
	{
		hp.getStatusOfLink();
	}
	@Test
	public void ValidateLogin() {
		String Url= lp.doLogin("test@gmail.com", "test123");
		Assert.assertTrue(Url.contains("customers"),"Test Failed -Title is not Matched");
		System.out.println("Test Pass: Title Matched ");
	}

}
