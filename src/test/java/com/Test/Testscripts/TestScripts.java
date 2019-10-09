package com.Test.Testscripts;

import java.io.IOException;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.Test.BaseClass.BaseClass;
import com.Test.Pages.SnapEngage_LoginPage;
import com.Test.Utility.TakeScreenShotAs;


public class TestScripts extends BaseClass
{

	
	@Test
	@Parameters({"uid","pid"}) 
	public void Verify_loginPage(@Optional("SnapEngage") String uid,String pid) throws InterruptedException, IOException
	{
		// creating the object
		SnapEngage_LoginPage page = new SnapEngage_LoginPage(driver);
		// Get the parameters from TestNG file
		page.SnapEngage_Login(uid,pid);
		//capture the screenshot on homePage
		TakeScreenShotAs.screenshotCapture();
		
	}
}
