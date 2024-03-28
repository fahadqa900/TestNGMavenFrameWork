package com.metlife.testsuite;

import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.io.IOException;

public class SwitchToClassicViewSection extends SetupTearDown
{
    @Test
    public static void switchClassicSection() throws InterruptedException, IOException
    {
        WebDriverUtils.switchClassicView();
        test=extent.startTest("ClassicView Test Executed");
        test.log(LogStatus.PASS,"ClassicView Test Passed");
    }
}
