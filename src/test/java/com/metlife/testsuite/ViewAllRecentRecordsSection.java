package com.metlife.testsuite;

import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.io.IOException;

public class ViewAllRecentRecordsSection extends SetupTearDown
{
    @Test
    public static void viewAllRecentRecordsSection() throws InterruptedException, IOException
    {
        WebDriverUtils.viewAllRecentRecords();
        test=extent.startTest("ViewAllRecent Test Executed");
        test.log(LogStatus.PASS,"ViewAllRecent Test Passed");
    }
}
