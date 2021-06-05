package com.OpenMRS.Configure;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import atu.testrecorder.exceptions.ATUTestRecorderException;

public class BrowserSetup extends Reports {
	public static WebDriver driver;
	public static Properties property;
	public static WebDriverWait wait;
	public static Properties properties() throws IOException
	{
		FileInputStream data=new FileInputStream("Data.properties");
		property=new Properties();
		property.load(data);
		return property;
	}
	
	@BeforeTest
	public void launchbrowser() throws IOException
	{
		properties();
		String title=property.getProperty("title");
		String browser=property.getProperty("browser");
		String url = property.getProperty("url");
		String chrome=property.getProperty("cd");
		String firefox=property.getProperty("fd");
		String opera=property.getProperty("od");
		String edge=property.getProperty("ed");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",chrome);
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",firefox);
			driver= new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("opera"))
		{
			System.setProperty("webdriver.opera.driver",opera);
			driver= new OperaDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver",edge);
			driver= new EdgeDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver",chrome);
			driver= new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		String actualtitle=driver.getTitle();
		Assert.assertEquals(title, actualtitle);
		System.out.println("Title Verified Successfully and the WebPage Title is: "+actualtitle);
	}
	@AfterTest
	public void teardown() throws ATUTestRecorderException
	{
		driver.quit();
	}
}
