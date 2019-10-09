package com.Test.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Test.BaseClass.BaseClass;

public class SnapEngage_LoginPage extends BaseClass
{
	
	public SnapEngage_LoginPage(WebDriver driver)
	{
		driver = BaseClass.driver;
		PageFactory.initElements(driver, this);
	}
		@FindBy(how=How.ID,using="email")
	private WebElement UserName;
	
	@FindBy(how=How.ID,using="password")
	private WebElement Password;
	
	@FindBy(how=How.XPATH,using="//input[@name='Submit']")
	private WebElement sign;
	
	@FindBy(how=How.XPATH,using="//div[@class='item page-1']")
	private WebElement ItemPage;
	
	
	// This method is used to verify login credentails and verify the Page Title
	public void SnapEngage_Login(String username, String password) throws InterruptedException
	{
		//Input the Username
		UserName.sendKeys(username);
		//Input the Password
		Password.sendKeys(password);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(sign));
		//Click on Sign Button
		sign.click();
		wait.until(ExpectedConditions.visibilityOf(ItemPage));
		//Validate the Page title on loading
		Assert.assertEquals("Hub", driver.getTitle(), "Page is not navigated to respective Page");
	}
	
}
