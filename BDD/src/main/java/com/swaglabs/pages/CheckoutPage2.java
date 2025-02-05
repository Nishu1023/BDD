package com.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage2 {
	@FindBy(className = "summary_subtotal_label")
	private WebElement itemTotal;
	@FindBy(className = "summary_tax_label")
	private WebElement tax;
	@FindBy(className = "summary_total_label")
	private WebElement nettTotal;
	@FindBy(linkText  = "FINISH")
	private WebElement finishButton;
	public CheckoutPage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String getItemTotal() {
		return itemTotal.getText();
	}
	public String getTax() {
		return tax.getText();
	}
	public String getNettTotal() {
		return nettTotal.getText();
	}
	public void setFinish() {
		finishButton.click();
	}
	
}
