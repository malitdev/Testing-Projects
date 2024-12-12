package org.malitcode.test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.malitcode.lib.AppLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	WebDriver driver;
	private AppLib app;
	public static Logger log = Logger.getLogger("devpinoyLogger");

	@Parameters("browser")
	@BeforeMethod
	public void setUp(String browser) throws Exception {
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\workspace\\eclipse-workspace\\BankXYZ\\src\\test\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
			log.debug("Chrome driver Launched !");
			
		} else if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\workspace\\eclipse-workspace\\BankXYZ\\src\\test\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
			log.debug("FireFox driver Launched !");
		}
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		app = new AppLib(driver);

		getApp().getFlow().navigateToUrl("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		log.debug("Website Loaded !");
		getApp().getFlow().maximWindow();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		log.debug("Test execution completed !");
		// getApp().getFlow().close();
	}

	public AppLib getApp() {
		return app;
	}

}
