package org.malitcode.test;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;



public class ManagerLoginTest extends BaseClass {
	
  @Test
  public void loginManager() throws InterruptedException {
	  
	   String firstName = "Nkosinathi";
	   String lastName = "Malala";
	   String code = "CMP123";
	  
	  log.debug("Inside Manager Test !");
	  getApp().getPages().getManagerLoginPage().clickManagerLoginButton();
	
	  getApp().getPages().getManagerLoginPage().clickFirstAddCustomerButton();
	
	  getApp().getPages().getManagerLoginPage().sendFirstName(firstName);
	  getApp().getPages().getManagerLoginPage().sendLasttName(lastName);
	  getApp().getPages().getManagerLoginPage().sendCode(code);
	
	  getApp().getPages().getManagerLoginPage().clickLastAddCustomerButton();
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  getApp().getPages().getManagerLoginPage().clickAlertButton();
	
	  getApp().getPages().getManagerLoginPage().clickShowCustomerButton();
	  
	  Assert.fail("Login Not Succesfful");
	 
	  log.debug("Manager Test Case Successfully executed !");
	

	    
  }
  
  
}
