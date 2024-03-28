package com.metlife.testsuite;

import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.io.IOException;

public class ViewUpdatedRecentRecordsSection extends SetupTearDown
{
    @Test
    public static void viewUpdatedRecentRecordsSection() throws InterruptedException, IOException
    {
    WebDriverUtils.viewUpdatedRecentRecords();
    test=extent.startTest("ViewUpdatedRecord Test Executed");
    test.log(LogStatus.PASS,"ViewUpdatedRecord Test Passed");
    }
}
