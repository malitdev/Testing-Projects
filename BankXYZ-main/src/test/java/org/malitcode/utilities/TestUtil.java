package org.malitcode.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.malitcode.test.BaseClass;



public class TestUtil extends BaseClass {
	static WebDriver driver;
	public static String screenshotPath;
	public static String screenshotName;
	
	public static void captureScreenshot() throws IOException {
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		//FileUtils.copyFile(scrFile,new File("C:\\Users\\workspace\\eclipse-workspace\\BankXYZ\\target\\surefire-reports\\" + screenshotName));
	
	
	}

}
