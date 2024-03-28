package com.metlife.testsuite;

import com.metlife.data.DemoDataProvider;
import com.metlife.pageobjects.LoginLocators;
import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.io.IOException;

public class LoginModule extends SetupTearDown
{
    @Test(dataProviderClass = DemoDataProvider.class,dataProvider = "DP")
    public static void getSalesForceLogin(String userName,String userPassword) throws IOException
    {
        WebDriverUtils.type(LoginLocators.uName,userName);
        WebDriverUtils.type(LoginLocators.uPwd,userPassword);
        WebDriverUtils.click(LoginLocators.uLogin);
        test=extent.startTest("SalesForceLogin Test Executed");
        test.log(LogStatus.PASS,"SalesForceLogin Test Passed");
    }
}
