package com.OpenMRS.PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPatientPage {
	@FindBy(name="givenName")
	public static WebElement given;
	@FindBy(name="middleName")
	public static WebElement middle;
	@FindBy(name="familyName")
	public static WebElement family;
	@FindBy(id="next-button")
	public static WebElement next;
	@FindBy(xpath="//select[@id='gender-field']")
	public static WebElement gender;
	@FindBy(name="birthdateDay")
	public static WebElement day;
	@FindBy(name="birthdateMonth")
	public static WebElement month;
	@FindBy(name="birthdateYear")
	public static WebElement year;
	@FindBy(id="address1")
	public static WebElement add1;
	@FindBy(id="address2")
	public static WebElement add2;
	@FindBy(id="cityVillage")
	public static WebElement city;
	@FindBy(id="stateProvince")
	public static WebElement state;
	@FindBy(id="country")
	public static WebElement country;
	@FindBy(id="postalCode")
	public static WebElement postal;
	@FindBy(name="phoneNumber")
	public static WebElement phone;
	@FindBy(xpath="//select[@id='relationship_type']")
	public static WebElement relationtype1;
	@FindBy(xpath="//input[@placeholder='Person Name']")
	public static WebElement personname1;
	@FindBy(xpath="//p[@style='padding: 10px']/a/i")
	public static WebElement addrelative;
	@FindBy(xpath="//a[starts-with(text(),' Smith')]")
	public static WebElement john;
	@FindBy(xpath="/html/body/div/div[3]/form/section[3]/div/fieldset/div/div[2]/p[1]/select")
	public static WebElement relationtype2;
	@FindBy(xpath="/html/body/div/div[3]/form/section[3]/div/fieldset/div/div[2]/p[2]/input[1]")
	public static WebElement personname2;
	@FindBy(xpath="//a[starts-with(text(),' Harris')]")
	public static WebElement william;
	@FindBy(xpath="//*[@id=\"relationship\"]/p[2]/ul")
	public static List<WebElement> pnamelist;
	@FindBy(id="submit")
	public static WebElement confirm;
	@FindBy(id="cancelSubmission")
	public static WebElement cancel;
}
