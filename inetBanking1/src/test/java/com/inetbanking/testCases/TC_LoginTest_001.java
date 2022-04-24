package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseTest {
	
	@Test
	public void loginTest()
	{
		
		LoginPage login = new LoginPage(driver);
		login.setUsername("mngr341390");
		login.setPassword("vYmajuh");
		login.clickOnLoginBtn();
	}

}
