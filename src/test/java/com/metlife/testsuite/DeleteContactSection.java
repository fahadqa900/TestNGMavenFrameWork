package com.metlife.testsuite;

import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.io.IOException;

public class DeleteContactSection extends SetupTearDown
{
    @Test
    public static void deleteContactSection() throws IOException
    {
        WebDriverUtils.deleteContact();
        test=extent.startTest("DeleteContact Test Executed");
        test.log(LogStatus.PASS,"DeleteContact Test Passed");
    }
}
