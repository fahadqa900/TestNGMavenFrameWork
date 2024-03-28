package com.metlife.testsuite;

import com.metlife.utility.WebDriverUtils;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import java.io.IOException;

public class SwitchToLightViewSection extends SetupTearDown
{
    @Test
    public static void addNewTaskSection() throws InterruptedException, IOException {
        WebDriverUtils.switchToLightView();
        test=extent.startTest("LightView Test Executed");
        test.log(LogStatus.PASS,"LightView Test Passed");
    }
}
