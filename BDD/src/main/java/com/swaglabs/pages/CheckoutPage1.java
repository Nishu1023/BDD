package com.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage1 {
	@FindBy(id = "first-name")
	private WebElement firstNameTbx;
	@FindBy(id = "last-name")
	private WebElement lastNameTbx;
	@FindBy(id = "postal-code")
	private WebElement zipCodeTbx;
	@FindBy(xpath = "//input[@value='CONTINUE']")
	private WebElement continueButton;
	public CheckoutPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setFirstName(String firstName) {
		firstNameTbx.sendKeys(firstName);
	}
	public void setlastName(String lastName) {
		lastNameTbx.sendKeys(lastName);
	}
	public void setZipCode(String zipcode) {
		zipCodeTbx.sendKeys(zipcode);
	}
	public void setContinue() {
		continueButton.click();
	}
}
