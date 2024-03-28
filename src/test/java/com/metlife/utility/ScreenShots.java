package com.metlife.utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
public class ScreenShots
{
    public static void getScreenShot(WebDriver driver, String ScreenShotName) throws IOException
    {
        TakesScreenshot tc=(TakesScreenshot)driver;
        File src= tc.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("src/test/Screenshots/"+ScreenShotName+".PNG"));
    }
}
