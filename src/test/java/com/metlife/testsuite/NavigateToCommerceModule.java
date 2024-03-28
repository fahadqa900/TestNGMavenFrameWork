package com.metlife.testsuite;

import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.io.IOException;

public class NavigateToCommerceModule extends SetupTearDown
{
    @Test
    public static void navigateToCommerceModule() throws InterruptedException, IOException
    {
        WebDriverUtils.navigateToCommerce();
        test=extent.startTest("LoginCommerce Test Executed");
        test.log(LogStatus.PASS,"LoginCommerce Test Passed");
    }
}
