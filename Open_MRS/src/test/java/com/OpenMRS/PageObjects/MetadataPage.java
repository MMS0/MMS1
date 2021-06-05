package com.OpenMRS.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MetadataPage {
	@FindBy(xpath="//a[contains(@id,'org-openmrs-module-admin')]")
	public static WebElement metadata;
	@FindBy(xpath="//a[contains(@id,'org-openmrs-module-adminui-manageLocations')]")
	public static WebElement managelocations;
	@FindBy(xpath="//a[contains(@class,'button')]")
	public static WebElement addlocation;
	@FindBy(id="name-field")
	public static WebElement newname;
	@FindBy(id="description-field")
	public static WebElement description;
	@FindBy(id="address1-field")
	public static WebElement address1;
	@FindBy(id="address2-field")
	public static WebElement address2;
	@FindBy(id="cityVillage-field")
	public static WebElement city;
	@FindBy(name="stateProvince")
	public static WebElement state;
	@FindBy(id="country-field")
	public static WebElement country;
	@FindBy(name="postalCode")
	public static WebElement postal;
	@FindBy(name="parentLocation")
	public static WebElement parentlocation;
	@FindBy(xpath="//input[contains(@value,'2')]")
	public static WebElement loginlocation;
	@FindBy(xpath="//input[contains(@value,'3')]")
	public static WebElement transferlocation;
	@FindBy(id="save-button")
	public static WebElement save;
	@FindBy(xpath="//p[contains(text(),'Location Saved')]")
	public static WebElement savemessage;
	@FindBy(xpath="//i[contains(@class,'icon-home small')]")
	public static WebElement homepage;

}
