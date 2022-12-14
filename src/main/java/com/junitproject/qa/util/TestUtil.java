package com.junitproject.qa.util;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;
import com.junitproject.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT = 10;
	public static long IMPLICIT_WAIT = 10;



public void takeSnapShot(WebDriver driver, String fileWithPath) throws Exception{

    //Convert web driver object to TakeScreenshot

    TakesScreenshot scrShot = ((TakesScreenshot)driver);

    //Call getScreenshotAs method to create image file

            File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

            File DestFile = new File(fileWithPath);

            //Copy file at destination

            Files.copy(SrcFile, DestFile);

}
}
