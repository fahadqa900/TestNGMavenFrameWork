package com.metlife.testsuite;

import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.io.IOException;

public class MarkContactFeature extends SetupTearDown
{
    @Test
    public static void markContactFeature() throws InterruptedException, IOException
    {
        WebDriverUtils.markContactClick();
        test=extent.startTest("MarkContact Test Executed");
        test.log(LogStatus.PASS,"MarkContact Test Passed");
    }
}
