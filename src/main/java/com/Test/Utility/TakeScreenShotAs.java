package com.Test.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Test.BaseClass.BaseClass;

public class TakeScreenShotAs extends BaseClass
{

	public static String screenshotCapture() throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir")+"//ScreenShots/"+"HubLogin"+".jpg";
		File destination = new File(dest);
		FileUtils.copyFile(src, destination);
		
		return dest;
		
	}
	
	
	
}
