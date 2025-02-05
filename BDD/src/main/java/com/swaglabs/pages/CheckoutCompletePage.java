package com.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage {
	@FindBy(className  = "complete-header")
	private WebElement completeHeader;
	public CheckoutCompletePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getCompleteHeader() {
		return completeHeader;
	}
}
