package com.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	@FindBy(linkText = "CHECKOUT")
	private WebElement checkoutLink;
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setCheckout() {
		checkoutLink.click();
	}
}
