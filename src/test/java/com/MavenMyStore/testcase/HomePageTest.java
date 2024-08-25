package com.MavenMyStore.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MavenMyStore.Pageobjects.HomePageObjects;
import com.MavenMyStore.base.BaseClass;

public class HomePageTest extends BaseClass {

	public HomePageObjects homepageobjects;
	@BeforeMethod
	
	public void BrowserLaunch()
	{

		launchApp();
		
	}
@BeforeMethod

	public void CloseWebApp()
	{
		closeApp();
		
	}
	
	@Test
	
	public void HomePage()
	{
	homepageobjects = new HomePageObjects();
	
	homepageobjects.signin();
	
	homepageobjects.login();
	}
	
}
