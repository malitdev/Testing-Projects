package org.malitcode.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import junit.framework.Assert;





public class CustomerLoginTest extends BaseClass {

  @Test
  public void loginCustomer() throws InterruptedException {
		
	  	final String amount ="1500";
	  	log.debug("Inside Customer Test Case !");
	  	
		getApp().getPages().getCustLoginPage().clickLoginButton();
	
		getApp().getPages().getCustLoginPage().selectCustomerDrop();
	
		getApp().getPages().getCustLoginPage().clickInsideLoginButton();
	
		
		getApp().getPages().getCustLoginPage().clickDepositButton();
	
		getApp().getPages().getCustLoginPage().sendAmountKeys(amount);
		
		getApp().getPages().getCustLoginPage().clickInsideDepButton();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		getApp().getPages().getCustLoginPage().verify();
	
		getApp().getPages().getCustLoginPage().clickLogoutButton();
		
		log.debug("Customer Test Case Successfully executed !");
	
	
		
		
  }
}
