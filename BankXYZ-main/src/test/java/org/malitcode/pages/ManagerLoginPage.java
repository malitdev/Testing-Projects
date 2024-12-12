package org.malitcode.pages;

import org.malitcode.elements.BankManagerLoginElements;
import org.malitcode.lib.AppLib;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class ManagerLoginPage {
	WebDriver driver;
	BankManagerLoginElements bankManPage;
	
	
	public ManagerLoginPage(WebDriver driver) {
		this.driver = driver;
		bankManPage = new BankManagerLoginElements(driver);
	}
	
	public void clickManagerLoginButton() {
		bankManPage.managerLoginBtn.click();
	}
	
	public void clickFirstAddCustomerButton() {
		bankManPage.firstAddCustomerBtn.click();
	}
	
	public void sendFirstName(String srcString) {
		bankManPage.firstNameTxt.sendKeys(srcString);
	}
	
	public void sendLasttName(String srcString) {
		bankManPage.lastNameTxt.sendKeys(srcString);
	}
	
	public void sendCode(String srcString) {
		bankManPage.postCodeTxt.sendKeys(srcString);
	}
	
	public void clickLastAddCustomerButton() {
		bankManPage.lastAddCustomerBtn.click();
	}
	
	public void clickShowCustomerButton() {
		bankManPage.showCustomerBtn.click();
	}
	
	public void clickAlertButton() {
		Alert a =  driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
	}

}
