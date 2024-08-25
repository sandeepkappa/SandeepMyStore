package com.MavenMyStore.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	public void launchApp()

	{
		// Ensures latest driver exists.
		WebDriverManager.chromedriver().setup();

		// driver is a reference variable. chromedriver is a class. webdriver is a
		// interface.
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.automationpractice.pl");
		driver.manage().window().maximize();
		
	}
	
	public void closeApp()
	{
		driver.close();
		
	}

}