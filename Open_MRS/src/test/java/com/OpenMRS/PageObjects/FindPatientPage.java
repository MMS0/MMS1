package com.OpenMRS.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindPatientPage {
	@FindBy(xpath="//a[starts-with(@id,'coreapps-active')]")
	public static WebElement findpatient;
	@FindBy(xpath="//input[@id='patient-search']")
	public static WebElement search;
	@FindBy(xpath="//td[contains(text(),'Test T Testing')]")
	public static WebElement patient;
	@FindBy(xpath="//i[contains(@class,'toggle-icon icon-caret-down')]")
	public static WebElement showinfo;
	@FindBy(xpath="//i[contains(@ng-show,'isEmpty')]")
	public static WebElement noteicon;
	@FindBy(xpath="//textarea[starts-with(@class,'editable')]")//textarea[contains(@placeholder,'Enter a note')]
	public static WebElement note;
	@FindBy(xpath="//button[starts-with(@title,'Submit')]")
	public static WebElement tick;
	@FindBy(xpath="//ul[@id='breadcrumbs']/li/a/i")
	public static WebElement homepage;
}
