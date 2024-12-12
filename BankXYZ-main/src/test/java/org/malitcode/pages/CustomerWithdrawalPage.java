package org.malitcode.pages;

import org.malitcode.elements.CustomerWithdrawalElements;
import org.openqa.selenium.WebDriver;

public class CustomerWithdrawalPage {
	
	WebDriver driver;
	CustomerWithdrawalElements custWidthdrawalElem;
	
	public CustomerWithdrawalPage(WebDriver driver){
		this.driver = driver;
		custWidthdrawalElem = new CustomerWithdrawalElements(driver);
		
	}
	
	public void clickWithdrawalButton() {
		custWidthdrawalElem.widrawalBtn.click();
	}
	
	public void sendWithdrawalAmount(String srcAmount) {
		custWidthdrawalElem.txtAmountWidrawal.sendKeys(srcAmount);
	}
	
	
	public void clickWithdrawalAmountFinal() {
		custWidthdrawalElem.widrawalBtnFinal.click();
	}
	
	public void clickLogoutButton() {
		custWidthdrawalElem.logoutBtn.click();
	}
	
	public boolean verifyTransaction() {
		
		boolean isVisible = custWidthdrawalElem.successMsg.isDisplayed();
		System.out.println(isVisible);
		return isVisible;
	}

}
