package com.metlife.testsuite;

import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.io.IOException;

public class CreateContactSection extends SetupTearDown
{
    @Test
    public static void createContactSection() throws InterruptedException, IOException {
        WebDriverUtils.createContact();
        test=extent.startTest("CreateContact Test Executed");
        test.log(LogStatus.PASS,"CreateContact Test Passed");
    }
}
