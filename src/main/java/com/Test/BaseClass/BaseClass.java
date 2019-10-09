package com.Test.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.Test.Utility.GetDriver;
import com.Test.Utility.ReadPropertyFile;

public class BaseClass 
{
	public static WebDriver driver;
	private static final int timeout = 20;
	
	@BeforeMethod
	public void TestInitailizer() throws Exception
	{
		driver = GetDriver.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		driver.get(ReadPropertyFile.readPropertyFile("URL"));
				
	}
	
	@AfterMethod
	public void TearDown() 
	{
		driver.close();
	}
	
	
	
}
