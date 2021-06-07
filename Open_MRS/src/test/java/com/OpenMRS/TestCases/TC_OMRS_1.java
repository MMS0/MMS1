package com.OpenMRS.TestCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.OpenMRS.Configure.BrowserSetup;
import com.OpenMRS.PageObjects.AllergiesPage;
import com.OpenMRS.PageObjects.ConditionsPage;
import com.OpenMRS.PageObjects.FindPatientPage;
import com.OpenMRS.PageObjects.HomePage;
import com.OpenMRS.PageObjects.LoginPage;
import com.OpenMRS.PageObjects.MetadataPage;
import com.OpenMRS.PageObjects.RegisterPatientPage;
import com.aventstack.extentreports.Status;

public class TC_OMRS_1 extends BrowserSetup{

	public void signin() throws InterruptedException, IOException
	{
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.uname.clear();
		LoginPage.uname.sendKeys(property.getProperty("uname"));
		test.log(Status.PASS,"Entering the Username Successfully");
		LoginPage.pwd.clear();
		LoginPage.pwd.sendKeys(property.getProperty("pwd"));
		test.log(Status.PASS,"Entering the Password Successfully");
		LoginPage.pharmacy.click();
		test.log(Status.INFO, "Selects the Pharmacy");
		File sc1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc1, new File("Screenshots\\1.Signpage.png"));
		Thread.sleep(1000);
		LoginPage.signin.click();
		test.log(Status.PASS,"Clicking the Signin button Successfully");
	}
	public void homepage() throws IOException
	{
		PageFactory.initElements(driver, HomePage.class);
		test.log(Status.PASS, "Enter into the Home page succesfuly");
		File sc2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc2, new File("Screenshots\\2.Homepage.png"));
		HomePage.registerpatient.click();
		test.log(Status.INFO, "Clicking the Register Patient module");
	}
	public void registerpatient() throws IOException, InterruptedException
	{
		PageFactory.initElements(driver, RegisterPatientPage.class);
		RegisterPatientPage.given.clear();
		RegisterPatientPage.given.sendKeys(property.getProperty("given"));
		RegisterPatientPage.middle.clear();
		RegisterPatientPage.middle.sendKeys(property.getProperty("middle"));
		RegisterPatientPage.family.clear();
		RegisterPatientPage.family.sendKeys(property.getProperty("family"));
		test.log(Status.PASS,"Entered the Patient name Successfully");
		File sc3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc3, new File("Screenshots\\3.Name.png"));
		RegisterPatientPage.next.click();
		//Select Patient Gender
		Select gen=new Select(RegisterPatientPage.gender);
		String gender=property.getProperty("gender");
		if(gender==("Female"))
				{
					gen.selectByVisibleText("Female");
				}
		else
				{
					gen.selectByVisibleText("Male");
				}
		test.log(Status.PASS,"Selected the Patient's Gender Successfully");
		File sc4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc4, new File("Screenshots\\4.Gender.png"));
		RegisterPatientPage.next.click();
		
		//Select Patient DOB
		RegisterPatientPage.day.sendKeys(property.getProperty("date"));
		Select mon=new Select(RegisterPatientPage.month);
		String month=property.getProperty("month");
		if(month.equals("May"))
		{
			mon.selectByVisibleText("May");
		}
		else
		{
			mon.deselectAll();
		}
		RegisterPatientPage.year.sendKeys(property.getProperty("year"));
		File sc5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc5, new File("Screenshots\\5.DOB.png"));
		test.log(Status.PASS,"Selected the Patient's Dat of Birth Successfully");
		RegisterPatientPage.next.click();
		
		//Select Patient Address
		RegisterPatientPage.add1.sendKeys(property.getProperty("add1"));
		RegisterPatientPage.add2.sendKeys(property.getProperty("add2"));
		RegisterPatientPage.city.sendKeys(property.getProperty("city"));
		RegisterPatientPage.state.sendKeys(property.getProperty("state"));
		RegisterPatientPage.country.sendKeys(property.getProperty("country"));
		RegisterPatientPage.postal.sendKeys(property.getProperty("postal"));
		File sc6=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc6, new File("Screenshots\\6.Address.png"));
		test.log(Status.PASS,"Entered the Patient's Address Successfully");
		RegisterPatientPage.next.click();
		
		//Enter Phone Number
		RegisterPatientPage.phone.sendKeys(property.getProperty("phone"));
		File sc7=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc7, new File("Screenshots\\7.Phone Number.png"));
		test.log(Status.PASS,"Entered the Patient's Phone Number Successfully");
		RegisterPatientPage.next.click();
		
		//Select Relatives
		Select relation=new Select(RegisterPatientPage.relationtype1);
		relation.selectByVisibleText("Parent");
		RegisterPatientPage.personname1.sendKeys(property.getProperty("parentname"));
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.visibilityOf(RegisterPatientPage.john));
		RegisterPatientPage.personname1.sendKeys(Keys.TAB);
		RegisterPatientPage.addrelative.click();
		Select relation2=new Select(RegisterPatientPage.relationtype2);
		relation2.selectByVisibleText("Sibling");
		RegisterPatientPage.personname2.sendKeys(property.getProperty("siblingname"));
		Thread.sleep(4000);
		//wait.until(ExpectedConditions.visibilityOf(RegisterPatientPage.william));
		RegisterPatientPage.personname2.sendKeys(Keys.TAB);
		test.log(Status.PASS,"Entered the Patient's relatives Successfully");
		File sc8=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc8, new File("Screenshots\\8.Relation.png"));
		RegisterPatientPage.next.click();
		
		//Enter Confirm
		Thread.sleep(1000);
		File sc9=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc9, new File("Screenshots\\9.Confirm.png"));
		test.log(Status.PASS,"Clicked the Confirm button Successfully");
		RegisterPatientPage.confirm.click();
		test.log(Status.PASS,"Patient Health Record created Successfully");
		File sc10=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc10, new File("Screenshots\\10.EHR.png"));
	}
		public void conditions() throws InterruptedException, IOException
		{
			PageFactory.initElements(driver, ConditionsPage.class);
			//Thread.sleep(1000);
			ConditionsPage.condition.click();
			Thread.sleep(1000);
			ConditionsPage.addcondition.click();
			ConditionsPage.condvalue.sendKeys(property.getProperty("condition"));
			Thread.sleep(1000);
			ConditionsPage.condlist.click();
			test.log(Status.PASS,"Enters the Patient Condition data Successfully");
			/*for(WebElement list:ConditionsPage.condlist)
			{
				String listvalue=list.getText();
				if(listvalue.equals(property.getProperty("condition")))
				{
					list.click();
					break;
				}
			}*/
			ConditionsPage.onsetdate.click();
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.visibilityOf(ConditionsPage.selectdate));
			ConditionsPage.selectdate.click();
			test.log(Status.PASS,"Enters the Patient Onset date Successfully");
			ConditionsPage.active.click();
			File sc11=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(sc11, new File("Screenshots\\11.Conditions.png"));
			Thread.sleep(1000);
			ConditionsPage.save.click();//submit();
			test.log(Status.PASS,"Clicks the Save button in Add New Condition page Successfully");
			Thread.sleep(1000);
			ConditionsPage.returnbutton.click();
			test.log(Status.PASS,"Redirecting to the EHR Page Successfully");
		}
		public void allergy() throws InterruptedException, IOException
		{
			PageFactory.initElements(driver, AllergiesPage.class);
			AllergiesPage.allergy.click();
			Thread.sleep(1000);
			AllergiesPage.addallergy.click();
			AllergiesPage.morphine.click();
			AllergiesPage.fever.click();
			AllergiesPage.headache.click();
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,200)");
			AllergiesPage.moderate.click();
			AllergiesPage.comment.sendKeys(property.getProperty("comment"));
			test.log(Status.PASS,"Entered all the Allergy datas Successfully");
			File sc12=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(sc12, new File("Screenshots\\12.Allergy.png"));
			AllergiesPage.save.click();
			test.log(Status.PASS,"Saved the particularly Entered Allergy datas Successfully");
			Thread.sleep(1000);
			AllergiesPage.delete.click();
			File sc13=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(sc13, new File("Screenshots\\13.Delete Allergy.png"));
			String alert=AllergiesPage.message.getText();
			System.out.println("Following alert is displaying after cliking the Delete button : "+alert);
			System.out.println("Delete Popup contains 2 options with following Text : "+AllergiesPage.yes.getText()+" and "
			+AllergiesPage.no.getText()+" buttons.");
			AllergiesPage.yes.click();
			test.log(Status.PASS,"Deleted the Saved Allergy datas Successfully");
			Thread.sleep(1000);
			AllergiesPage.noallergy.click();
			Thread.sleep(1000);
			AllergiesPage.returnhome.click();
			Thread.sleep(1000);
			test.log(Status.PASS,"Return back to the EHR Page Successfully");
			AllergiesPage.home.click();
			test.log(Status.WARNING,"Redirecting to the Home Page");
			Thread.sleep(1000);
			File sc14=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(sc14, new File("Screenshots\\14.HomePage.png"));
		}
		public void findpatient() throws InterruptedException, IOException
		{
			PageFactory.initElements(driver, FindPatientPage.class);
			FindPatientPage.findpatient.click();
			test.log(Status.PASS,"Redirecting to the FindPatient Page Successfully");
			FindPatientPage.search.sendKeys(property.getProperty("search"));
			Thread.sleep(2000);
			test.log(Status.PASS,"Patient Search results have shown Successfully");
			FindPatientPage.patient.click();
			Thread.sleep(1000);
			FindPatientPage.showinfo.click();
			File sc15=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(sc15, new File("Screenshots\\15.Patient Info Page.png"));
			test.log(Status.PASS,"Showing Patient Info Successfully");
			FindPatientPage.noteicon.click();
			FindPatientPage.note.sendKeys(property.getProperty("patientnote"));
			test.log(Status.PASS,"Entered Patient Note Successfully");
			File sc16=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(sc16, new File("Screenshots\\16.Patient Note Page.png"));
			FindPatientPage.homepage.click();
		}
		public void metadata() throws IOException, InterruptedException
		{
			PageFactory.initElements(driver, MetadataPage.class);
			MetadataPage.metadata.click();
			test.log(Status.PASS,"Navigated to MetaData Page Successfully");
			File sc17=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(sc17, new File("Screenshots\\17.MetaData Page.png"));
			MetadataPage.managelocations.click();
			Thread.sleep(1000);
			File sc18=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(sc18, new File("Screenshots\\18.List MetaData Locations.png"));
			MetadataPage.addlocation.click();
			test.log(Status.PASS,"Navigated to New Add Location page Successfully");
			MetadataPage.newname.sendKeys(property.getProperty("newname"));
			MetadataPage.description.sendKeys(property.getProperty("description"));
			MetadataPage.address1.sendKeys(property.getProperty("add1"));
			MetadataPage.address2.sendKeys(property.getProperty("add2"));
			MetadataPage.city.sendKeys(property.getProperty("city"));
			//MetadataPage.address1.sendKeys(Keys.DOWN);
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)");
			MetadataPage.state.sendKeys(property.getProperty("state"));
			MetadataPage.country.sendKeys(property.getProperty("country"));
			MetadataPage.postal.sendKeys(property.getProperty("postal"));
			Select location=new Select(MetadataPage.parentlocation);
			location.selectByVisibleText("Laboratory");
			MetadataPage.loginlocation.click();
			MetadataPage.transferlocation.click();
			test.log(Status.PASS,"Entered all the data fields in New Add Location page Successfully");
			File sc19=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(sc19, new File("Screenshots\\19.NewLocations.png"));
			MetadataPage.save.click();
			Thread.sleep(1000);
			test.log(Status.PASS,"Saved New Add Location page with valid datas Successfully");
			//String alert2=driver.switchTo().alert().getText();
			System.out.println("Saved New Add Location page with valid datas Successfully and It's alert Message is : "+MetadataPage.savemessage.getText());
			File sc20=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(sc20, new File("Screenshots\\20.SavedLocations.png"));
			MetadataPage.homepage.click();
			test.log(Status.WARNING,"Redirecting to the homePage");
		}
		public void signout()
		{
			PageFactory.initElements(driver, HomePage.class);
			HomePage.signout.click();
			System.out.println("Test Case Execution Completed Successfully "
					+ "\n ***********Thank you for giving this Wonderful Opportunity************");
			test.log(Status.WARNING,"SignOut from the OpenMRS account");
			
		}
	
	@Test
	public void openmrs() throws InterruptedException, IOException
	{
		signin();
		homepage();
		registerpatient();
		conditions();
		allergy();
		findpatient();
		metadata();
		signout();
	}
}	