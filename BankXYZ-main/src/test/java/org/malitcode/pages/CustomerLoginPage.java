package org.malitcode.pages;


import org.malitcode.elements.CustomerLoginElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CustomerLoginPage {
	
	WebDriver driver;
	CustomerLoginElements  custLogElem;

	
	public CustomerLoginPage(WebDriver driver) {
		this.driver = driver;
		custLogElem = new CustomerLoginElements(driver);	
	}
	
	public void clickLoginButton() {
		custLogElem.loginBtn.click();
	}
	
	public void selectCustomerDrop() {
		WebElement staticDrop = custLogElem.userDropDown;
		Select dropdown = new Select(staticDrop);
		dropdown.selectByIndex(1);
		//System.out.println(custLogElem.userDropDown.getText());
		
	}
	
	public void clickInsideLoginButton() {
		custLogElem.insideLoginBtn.click();
	}
	
	public void clickDepositButton() {
		custLogElem.depositBtn.click();
	}
	
	public void sendAmountKeys(String srcString) {
		custLogElem.txtAmount.sendKeys(srcString);
	}
	
	public void clickInsideDepButton() {
		custLogElem.insideDepositBtn.click();
	}
	
	public void clickLogoutButton() {
		custLogElem.logoutBtn.click();
	}
	
	public boolean verify() {
		boolean isVisible = custLogElem.successMsg.isDisplayed();
		System.out.println(isVisible);
		return isVisible;
	}
	
	
	

}
