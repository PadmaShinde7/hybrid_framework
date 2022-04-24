package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver,this);
		
	}

	@FindBy(name="uid")
	WebElement txt_username;
	
	@FindBy(name="password")
	WebElement txt_password;
	
	@FindBy(name="btnLogin")
	WebElement loginBtn;
	
	public void setUsername(String username)
	{
	   txt_username.clear();
	   txt_username.sendKeys(username);
	}
	public void setPassword(String paas)
	{
		txt_password.clear();
		txt_password.sendKeys(paas);
	}
	public void clickOnLoginBtn()
	{
		loginBtn.click();
		
	}
}
