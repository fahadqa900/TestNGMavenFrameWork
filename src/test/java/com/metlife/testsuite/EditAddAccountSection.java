package com.metlife.testsuite;

import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.io.IOException;

public class EditAddAccountSection extends SetupTearDown
{
    @Test
    public static void editAddAccountSection() throws InterruptedException, IOException
    {
        WebDriverUtils.editaddAccount();
        test=extent.startTest("EditAccount Test Executed");
        test.log(LogStatus.PASS,"EditAccount Test Passed");
    }
}
