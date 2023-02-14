package StepDefinitions;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.uiautomation.pages.HomePage;
import com.uiautomation.utilities.BrowserFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RequestDemoTestcase 
{
	public WebDriver driver;

	@Given("the user logins using bowser")
	public void launchbrowser() throws MalformedURLException
	{
		driver=BrowserFactory.startBrowser("Chrome", "https://freshdesk.com/");
	}
	
	@When("the users loads the url")
	public void launchurl() throws MalformedURLException
	{
		System.out.println("URL Launched ******");
	}
	@Then("the user clicks on product navigate to request demo form")
	public void clickProduct() throws InterruptedException
	{
		HomePage homepage=PageFactory.initElements(driver, HomePage.class);
		homepage.click();
		
	}
	
	
}
