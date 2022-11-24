package com.uiautomation.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

WebDriver driver;
	
	public HomePage(WebDriver localDriver)
	{
		this.driver=localDriver;
	}
	@FindBy(xpath = "//a[.='Products']//following-sibling::i[1]")
	WebElement Products;
	@FindBy(xpath ="//h2[.='Freshdesk']")
	WebElement FreshDesk;
	@FindBy(xpath = "//button[.='ACCEPT ALL']")
	WebElement AcceptCookies;
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Engage')]")
	WebElement StartTodayText;
	@FindBy(how = How.XPATH,using="//p[contains(text(),'Engage')]//following-sibling::div[@class='mt-md']//a[last()]")
	WebElement RequestDemo;
	
	public void click() throws InterruptedException
	{
		AcceptCookies.click();
		
		Products.click();
		
		Thread.sleep(5000);
		
		FreshDesk.click();
		
		Thread.sleep(5000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",StartTodayText);
		
		Thread.sleep(5000);
		
		RequestDemo.click();
		
	}
}
