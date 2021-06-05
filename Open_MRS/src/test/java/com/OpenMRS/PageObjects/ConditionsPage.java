package com.OpenMRS.PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConditionsPage {
	@FindBy(xpath="//div[@class='row']/div[2]/div[3]/div/i[2]")
	public static WebElement condition;
	@FindBy(id="conditionui-addNewCondition")
	public static WebElement addcondition;
	@FindBy(xpath="//ul[@id='concept-and-date']")
	public static WebElement conditiontable; 
	@FindBy(id="conceptId-input")
	public static WebElement condvalue;
	@FindBy(xpath="//ul[starts-with(@id,'typeahead')]/li")////ul[starts-with(@id,'typeahead')]
	public static WebElement condlist;
	@FindBy(xpath="//li[@class='group']/span/span/input")//fr4990-display
	public static WebElement onsetdate;
	@FindBy(xpath="/html/body/div[2]/div[3]/table/tbody/tr")///html/body/div[2]/div[3]/table/tbody/tr[1]/td[7]
	public static List<WebElement> date;
	@FindBy(xpath="//td[starts-with(text(),'1')]")//td[contains(text(),'1')]
	public static WebElement selectdate;
	@FindBy(id="status-1") public static WebElement active;
	@FindBy(id="status-2") public static WebElement inactive;
	@FindBy(xpath="//*[@id=\"actions\"]/button")//*[@id='addConditionBtn']")//*[@id="actions"]/button
	public static WebElement save;
	@FindBy(xpath="//*[@id='condition']/div[3]/button[1]")
	public static WebElement returnbutton;
}
