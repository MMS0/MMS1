package com.OpenMRS.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllergiesPage {
	@FindBy(xpath="//i[contains(@id,'allergyui')]")
	public static WebElement allergy;
	@FindBy(xpath="//button[contains(@id,'allergyui')]")
	public static WebElement addallergy;
	@FindBy(xpath="//label[contains(text(),'Morphine')]")
	public static WebElement morphine;
	@FindBy(xpath="//label[contains(text(),'Fever')]")
	public static WebElement fever;
	@FindBy(xpath="//label[contains(text(),'Headache')]")
	public static WebElement headache;
	@FindBy(xpath="//label[contains(text(),'Moderate')]")
	public static WebElement moderate;
	@FindBy(xpath="//textarea[@id='allergy-comment']")
	public static WebElement comment;
	@FindBy(xpath="//input[@id='addAllergyBtn']")
	public static WebElement save;
	@FindBy(xpath="//i[contains(@title,'Delete')]")
	public static WebElement delete;
	@FindBy(xpath="//span[starts-with(@id,'removeAll')]")
	public static WebElement message;
	@FindBy(xpath="//button[contains(text(),'Yes')]")
	public static WebElement yes;
	@FindBy(xpath="//button[contains(text(),'No')]")
	public static WebElement no;
	@FindBy(xpath="//button[contains(text(),'No Known')]")//button[starts-with(text(),'No')]
	public static WebElement noallergy;
	@FindBy(xpath="//button[contains(text(),'Return')]")
	public static WebElement returnhome;
	@FindBy (xpath="//i[contains(@class,'icon-home small')]")
	public static WebElement home;

}
