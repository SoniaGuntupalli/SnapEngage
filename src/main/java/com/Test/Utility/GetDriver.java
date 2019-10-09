package com.Test.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Test.BaseClass.BaseClass;

public class GetDriver extends BaseClass
{
	private enum browser
	{
		firefox,
		chrome
	};

	private static WebDriver getChromedriver()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ExtLib\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
		
	}
	
	private static WebDriver getFirefoxdriver()
	{
		System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+"\\ExtLib\\geckodriver.exe");
		driver = new FirefoxDriver();
		return driver;
		
	}
	
	public static WebDriver getDriver() throws Exception
	{
		String browserIs = ReadPropertyFile.readPropertyFile("browser");
		browser enumObj = browser.chrome;
		String browserName = enumObj.name();
		
		
		if(browserIs.equals(browserName))
		{
			driver = getChromedriver();
		}
		else if(!browserIs.equals(browserName))
		{
			driver = getFirefoxdriver();
		}
		
		else
		{
			throw new Exception("Invalid Browser input");
		}
		return driver;
	}
	
	
}
