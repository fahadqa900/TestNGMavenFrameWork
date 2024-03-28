package com.metlife.testsuite;

import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.io.IOException;

public class CreateAccountSection extends SetupTearDown {
    @Test
    public static void createNewAccountSection() throws InterruptedException, IOException {
        WebDriverUtils.createNewAccount();
       test=extent.startTest("CreateAccount Test Executed");
        test.log(LogStatus.PASS,"CreateAccount Test Passed");
    }
}
