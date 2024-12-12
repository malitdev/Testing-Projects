package org.malitcode.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class CustomerWithdrawalTest extends BaseClass{
  @Test
  public void makeWidrawal() {
	  
	  String amount = "1000";
	  log.debug("Inside Withdrawal Test Case !");
	  
	  getApp().getPages().getCustLoginPage().clickLoginButton();
	  
	  getApp().getPages().getCustLoginPage().selectCustomerDrop();
	  
	  getApp().getPages().getCustLoginPage().clickInsideLoginButton();
	  
	  getApp().getPages().getCustomerWithdrawalPage().clickWithdrawalButton();
	  
	  getApp().getPages().getCustomerWithdrawalPage().sendWithdrawalAmount(amount);
	  
	  getApp().getPages().getCustomerWithdrawalPage().clickWithdrawalAmountFinal();
	  
	  getApp().getPages().getCustomerWithdrawalPage().verifyTransaction();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  getApp().getPages().getCustomerWithdrawalPage().clickLogoutButton();
	  
	  log.debug("Customer Widthdrawal Test Finished !");
  }
}
