package org.malitcode.elements;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CustomerLoginElements {
	
	WebDriver driver;

	//@FindBy(xpath="//button[text()='Customer Login']") public WebElement loginBtn;
	@FindBy(xpath="	//button[@ng-click='customer()']") public WebElement loginBtn;
	
	@FindBy(xpath="//button[text()='Login']") public WebElement insideLoginBtn;
	
	@FindBy(id="userSelect") public WebElement userDropDown;
	
	//deposit elements
	@FindBy(xpath="//button[@ng-click='deposit()']")  public WebElement depositBtn;
	
	@FindBy(xpath="//input[@ng-model='amount']") public WebElement txtAmount;
	
	//inside deposit button
	@FindBy(xpath="//button[text()='Deposit']") public WebElement insideDepositBtn;
	
	@FindBy(xpath="//button[@ng-click='byebye()']") public WebElement logoutBtn;
	
	@FindBy(xpath="//span[@ng-show='message']") public WebElement successMsg;
	
	
	
	
	//This constructor for init
	public CustomerLoginElements(WebDriver driver) {
		this.driver =  driver;
		PageFactory.initElements(driver, this);
	}
	

}
