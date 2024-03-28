package com.metlife.testsuite;

import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.io.IOException;

public class ClickOnAccountInRecentRecordsSection extends SetupTearDown
{
    @Test
    public static void clickOnAccountInRecentRecordSection() throws InterruptedException, IOException {
        WebDriverUtils.clickOnAccountInRecentRecord();
        test=extent.startTest("ClickRecentRecord Test Executed");
        test.log(LogStatus.PASS,"ClickRecentRecord Test Passed");
    }
}
