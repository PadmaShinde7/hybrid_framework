package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver ;
	
	@BeforeTest
	@Parameters({"browser","url"})
	public void setUp(@Optional("Chrome")String brName,
			@Optional ("https://demo.guru99.com/v4/")String url)
	{
		if (brName.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		else if (brName.equals("Firefox"))
		{
			WebDriverManager.chromedriver().setup();
			driver =new FirefoxDriver();
		}
		else
		{
			System.out.println("browser not matched please check with expected browser");
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
}
