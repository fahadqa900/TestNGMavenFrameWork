package com.metlife.testsuite;

import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.io.IOException;

public class NavigateToContactSection extends SetupTearDown
{
    @Test
    public static void navigateToContactSection() throws IOException
    {
        WebDriverUtils.navigateToContacts();
        test=extent.startTest("NavigateContact Test Executed");
        test.log(LogStatus.PASS,"NavigateContact Test Passed");
    }
}
