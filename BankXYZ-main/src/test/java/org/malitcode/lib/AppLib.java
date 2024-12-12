package org.malitcode.lib;

import org.openqa.selenium.WebDriver;

public class AppLib {
	
	WebDriver driver;
	private PageLib page;
	private FlowLib flow;
	
	public AppLib(WebDriver driver) {
		this.driver= driver;
		page =new PageLib(this.driver);
		flow = new FlowLib(driver);
	}
	
	public PageLib getPages() {
		return page;
	}
	
	public FlowLib getFlow() {
		return flow;
	}

}
