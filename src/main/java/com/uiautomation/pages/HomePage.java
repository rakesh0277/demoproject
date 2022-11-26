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
	WebElement products;
	@FindBy(xpath ="//h2[.='Freshdesk']")
	WebElement freshDesk;
	@FindBy(xpath = "//button[.='ACCEPT ALL']")
	WebElement acceptCookies;
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Engage')]")
	WebElement startTodayText;
	@FindBy(how = How.XPATH,using="//p[contains(text(),'Engage')]//following-sibling::div[@class='mt-md']//a[last()]")
	WebElement requestDemo;
	
	public void click() throws InterruptedException
	{
		acceptCookies.click();
		
		products.click();
		
		Thread.sleep(5000);
		
		freshDesk.click();
		
		Thread.sleep(5000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",startTodayText);
		
		Thread.sleep(5000);
		
		requestDemo.click();
		
	}
}
