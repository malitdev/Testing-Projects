package org.malitcode.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerWithdrawalElements {
	
	    WebDriver driver;
	    
		@FindBy(xpath="//button[@ng-click='withdrawl()']") public WebElement widrawalBtn;
		
		@FindBy(xpath="//input[@ng-model='amount']") public WebElement txtAmountWidrawal;
		
		@FindBy(xpath="//button[text()='Withdraw']") public WebElement widrawalBtnFinal;
		
		@FindBy(xpath="//button[@ng-click='byebye()']") public WebElement logoutBtn;
		
		@FindBy(xpath="//span[text()='Transaction successful']") public WebElement successMsg;

		//This constructor for init
		public CustomerWithdrawalElements(WebDriver driver) {
			this.driver =  driver;
			PageFactory.initElements(driver, this);
		}

}
