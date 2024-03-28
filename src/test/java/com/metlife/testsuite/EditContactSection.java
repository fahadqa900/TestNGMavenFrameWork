package com.metlife.testsuite;

import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.io.IOException;

public class EditContactSection extends SetupTearDown
{
    @Test
    public static void editContactSection() throws IOException
    {
        WebDriverUtils.editContact();
        test=extent.startTest("EditContact Test Executed");
        test.log(LogStatus.PASS,"EditContact Test Passed");
    }
}
