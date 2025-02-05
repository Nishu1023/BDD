package com.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
@FindBy(className = "product_sort_container")
private WebElement product_sort_dropdown;
@FindBy(xpath = "//button[text()='ADD TO CART']")
private WebElement addToCartButton;
@FindBy(xpath = "//div[@id='shopping_cart_container']/descendant::span")
private WebElement itemAddedCount;
@FindBy(id = "shopping_cart_container")
private WebElement cartIcon;
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setOptionInSortDropdown(String visibleText) {
	Select s=new Select(product_sort_dropdown);
	s.selectByContainsVisibleText(visibleText);
}
public void setAddToCart() {
	addToCartButton.click();
}
public String getItemAddedCount() {
	return itemAddedCount.getText();
}
public void setCartIcon() {
	cartIcon.click();
}
}
