package com.metlife.testsuite;

import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.io.IOException;

public class DeleteAccountFeature extends SetupTearDown
{
    @Test
    public static void deleteAccountFeature() throws IOException
    {
        WebDriverUtils.deleteAccountFeature();
        test=extent.startTest("DeleteAccount Test Executed");
        test.log(LogStatus.PASS,"DeleteAccount Test Passed");
    }
}
