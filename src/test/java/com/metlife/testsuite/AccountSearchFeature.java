package com.metlife.testsuite;

import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.io.IOException;

public class AccountSearchFeature extends SetupTearDown
{
    @Test
    public static void accountSearchFeature() throws IOException
    {
        WebDriverUtils.accountSearch();
        test=extent.startTest("AccountSearch Test Executed");
        test.log(LogStatus.PASS,"AccountSearch Test Passed");
    }
}
