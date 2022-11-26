package com.uiautomation.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.uiautomation.pages.HomePage;
import com.uiautomation.utilities.BrowserFactory;



public class RequestDemoTestCase {
	public WebDriver driver;
	
	
	@BeforeMethod
	public void launchbrowser()
	{
		driver=BrowserFactory.startBrowser("Chrome", "https://freshdesk.com/");
	}
	
	@Test
	public void verifyRequestDemo() throws InterruptedException
	{
		System.out.println("Title of the Page :" +driver.getTitle());
		HomePage homepage=PageFactory.initElements(driver, HomePage.class);
		homepage.click();
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}
}
