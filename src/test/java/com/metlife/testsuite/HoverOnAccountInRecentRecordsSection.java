package com.metlife.testsuite;

import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.io.IOException;

public class HoverOnAccountInRecentRecordsSection extends SetupTearDown
{
    @Test
    public  static void hoverOnAccountInRecentRecordSection() throws InterruptedException, IOException
    {
        WebDriverUtils.hoverOnAccountInRecentRecord();
        test=extent.startTest("HoverAccount Test Executed");
        test.log(LogStatus.PASS,"HoverAccount Test Passed");
    }
}
