package com.metlife.testsuite;

import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.io.IOException;

public class LogoutSection extends SetupTearDown
{
    @Test
    public static void getLogout() throws InterruptedException, IOException
    {
        WebDriverUtils.getSalesForceLogout();
        test=extent.startTest("Logout Test Executed");
        test.log(LogStatus.PASS,"Logout Test Passed");
    }
}