package com.Test.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile
{

	private static String filePath = System.getProperty("user.dir")+ "//Config.properties";
	
	public static String readPropertyFile(String Key) throws IOException
	{
		FileInputStream fileIs = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fileIs);
		String valueIs = prop.getProperty(Key);
		
		return valueIs;		
		
	}
	
}
