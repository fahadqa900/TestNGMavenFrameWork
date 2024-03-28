package com.metlife.testsuite;

import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.io.IOException;

public class ListIntelligenceViewSection extends SetupTearDown
{
    @Test
    public static void listIntelligenceView() throws InterruptedException, IOException
    {
        WebDriverUtils.listIntelligence();
       test=extent.startTest("ListIntelligenceView Test Executed");
        test.log(LogStatus.PASS,"ListIntelligenceView Test Passed");
    }
}
