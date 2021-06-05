package com.OpenMRS.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(id="referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")
	public static WebElement registerpatient;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")
	public static WebElement signout;
	
}
