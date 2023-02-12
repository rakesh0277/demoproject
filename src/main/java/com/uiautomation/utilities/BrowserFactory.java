package com.uiautomation.utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	private BrowserFactory() {
		throw new IllegalStateException("Utility class");
	}

	static WebDriver driver;
//	@SuppressWarnings("rawtypes")
//	static AbstractDriverOptions options = null;
//	static ChromeOptions chromeOptions=null;

	public static WebDriver startBrowser(String browsername, String url) throws MalformedURLException {
		if (browsername.equalsIgnoreCase("FireFox")) {

			driver = new FirefoxDriver();
//====================Below options to run testcase in docker=======
//			options = new FirefoxOptions();
//			options.setCapability("browsername", "firefox");

		} else if (browsername.equalsIgnoreCase("Chrome")) {

//====================Below options to run testcase in docker=======
//			options = new ChromeOptions();
//			options.setCapability("browsername", "chrome");
//====================Below options for Zalenium=====================
//			chromeOptions= new ChromeOptions();
//			chromeOptions.addArguments("--disable-dev-shm-usage");
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
//====================Below options to run testcase in docker=======
//			options = new EdgeOptions();
//			options.setCapability("browsername", "edge");
		}
//================below options to run test case in remote server like docker==============
//		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
		driver.get(url);
		return driver;
	}
}
