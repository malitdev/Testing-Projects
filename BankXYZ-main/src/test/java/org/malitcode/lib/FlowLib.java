package org.malitcode.lib;

import org.openqa.selenium.WebDriver;

public class FlowLib {
	
	private WebDriver driver;
	
	public FlowLib(WebDriver driver) {
		this.driver = driver;
	}
	
	//Get site url
	public void navigateToUrl(String url) {
		this.driver.get(url);
	}
	
	public void maximWindow() {
		 driver.manage().window().maximize();
	}
	
	public void close() {
		driver.close();
	}

}
