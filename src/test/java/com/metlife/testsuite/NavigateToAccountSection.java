package com.metlife.testsuite;

import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.io.IOException;

public class NavigateToAccountSection extends SetupTearDown
{
    @Test
    public static void navigateToAccountSection() throws IOException
    {
        WebDriverUtils.navigateToAccount();
        test=extent.startTest("NavigateAccount Test Executed");
        test.log(LogStatus.PASS,"NavigateAccount Test Passed");
    }
}
