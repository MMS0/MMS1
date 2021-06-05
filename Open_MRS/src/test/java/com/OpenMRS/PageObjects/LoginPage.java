package com.OpenMRS.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	@FindBy(how=How.ID,using="username")
	public static WebElement uname;
	
	@FindBy(id="password")
	public static WebElement pwd;
	
	@FindBy(id="loginButton")
	public static WebElement signin;
	
	@FindBy(id="Pharmacy")
	public static WebElement pharmacy;
}
