package com.MavenMyStore.Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MavenMyStore.base.BaseClass;

public class HomePageObjects extends BaseClass {

	@FindBy(xpath="//a[@title='Log in to your customer account']")
	WebElement SignInLink;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement LoginEmail;
	 
	@FindBy(xpath="//input[@id='passwd']")
	WebElement LoginPassword;
	
	@FindBy(xpath="//span[normalize-space()='Sign in']")
	WebElement SignInButton;
	
	public HomePageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void signin()	
	{
		SignInLink.click();		
	}
	
	public void login()
	{
		LoginEmail.sendKeys("admin27@xyz.com");
		LoginPassword.sendKeys("admin@123");
		SignInButton.click();
	}
	
	
	
}
