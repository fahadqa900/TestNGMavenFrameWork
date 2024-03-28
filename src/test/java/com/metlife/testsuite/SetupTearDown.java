package com.metlife.testsuite;

import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import java.io.File;
import java.io.IOException;

public class SetupTearDown
{
@BeforeSuite
public void launchBrowser() throws IOException
{
WebDriverUtils.initialize();
WebDriverUtils.launchUrl("https://resourceful-bear-twv16u-dev-ed.trailblaze.my.salesforce.com/");
}
static ExtentReports extent;
static ExtentTest test;
@BeforeTest
public static void setConfiguration()
{
extent=new ExtentReports("src/test/Report/DemoReport.html",true);
extent.addSystemInfo("Environment","QA");
extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
}
@AfterMethod
public static void getReport(ITestResult result)
{
if(result.getStatus()==ITestResult.FAILURE)
{
test.log(LogStatus.FAIL,result.getThrowable()+"Test Failed");
}
else if(result.getStatus()==ITestResult.SKIP)
{
test.log(LogStatus.SKIP,result.getThrowable()+"Test Skipped");
}
else if(result.getStatus()==ITestResult.SUCCESS)
{
test.log(LogStatus.PASS,result.getThrowable()+"Test Passed");
}
extent.endTest(test);
}
@AfterTest
public static void cleanUp()
{
extent.flush();
}
}