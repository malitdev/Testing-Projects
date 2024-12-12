package org.malitcode.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerLoginElements {
	
	WebDriver driver;

	@FindBy(xpath="//button[@ng-click='manager()']") public WebElement managerLoginBtn;
	@FindBy(xpath="//button[@ng-click='addCust()']") public WebElement firstAddCustomerBtn;
	@FindBy(xpath="//input[@ng-model='fName']") public WebElement firstNameTxt;
	@FindBy(xpath="//input[@ng-model='lName']") public WebElement lastNameTxt;
	@FindBy(xpath="//input[@ng-model='postCd']") public WebElement postCodeTxt;
	@FindBy(xpath="	//button[text()='Add Customer']") public WebElement lastAddCustomerBtn;
	@FindBy(xpath="//button[@ng-click='showCust()']") public WebElement showCustomerBtn;
	
	
	public BankManagerLoginElements(WebDriver driver) {
		this.driver =  driver;
		PageFactory.initElements(driver, this);
	}
	

}
