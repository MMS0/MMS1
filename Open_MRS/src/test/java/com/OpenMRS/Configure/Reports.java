package com.OpenMRS.Configure;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Reports {
	public static ExtentHtmlReporter htmlreport;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ATUTestRecorder recorder;
	public static DateFormat dateformat;
	public static Date date;
	
	@BeforeClass
	public void ExtentReports() throws ATUTestRecorderException
	{
		htmlreport=new ExtentHtmlReporter("Reports//ExtentReports.html");
		htmlreport.config().setReportName("OpenMRS Test Script");
		htmlreport.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlreport.config().setChartVisibilityOnOpen(true);
		htmlreport.config().setTheme(Theme.STANDARD);
		extent=new ExtentReports();
		extent.attachReporter(htmlreport);
		test=extent.createTest("OpenMRS Test Scripts");
		
		dateformat=new SimpleDateFormat("dd-MM-yyyy  HH-mm-ss");
		date=new Date();
		test.log(Status.INFO,"Current Date and Time is: "+date);
		recorder=new ATUTestRecorder("Recorder", "TestScriptVideo-"+ dateformat.format(date), true);
		recorder.start();
	}
	@AfterClass
	public void endreports() throws ATUTestRecorderException
	{
		recorder.stop();
		extent.flush();
		
	}

}
