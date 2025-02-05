package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.swaglabs.pages.CartPage;
import com.swaglabs.pages.CheckoutCompletePage;
import com.swaglabs.pages.CheckoutPage1;
import com.swaglabs.pages.CheckoutPage2;
import com.swaglabs.pages.HomePage;

import hooks.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabs {
	WebDriver driver=BaseClass.driver;
	HomePage h;
	CheckoutPage1 c1;
	CheckoutPage2 c2;
	
@Given("user should be present in home page of swag labs")
public void user_should_be_present_in_home_page_of_swag_labs() {
	System.out.println(driver.getCurrentUrl());
}

@When("he selects the low to high price option in the dropdown")
public void he_selects_the_low_to_high_price_option_in_the_dropdown() {
	h=new HomePage(driver);
	h.setOptionInSortDropdown("(low to high)");
}

@And("he clicks on add to cart button of the first item")
public void he_clicks_on_add_to_cart_button_of_the_first_item() {
	h.setAddToCart();
}

@Then("the item should be added to the cart")
public void the_item_should_be_added_to_the_cart() {
	String itemsAdded = h.getItemAddedCount();
	System.out.println(itemsAdded+" items has been added to the cart");	
}

@When("he clicks on cart icon")
public void he_clicks_on_cart_icon() {
	h.setCartIcon();
}

@Then("he should be present in cart page")
public void he_should_be_present_in_cart_page() {
	System.out.println(driver.getCurrentUrl());
}

@When("he clicks on checkout button")
public void he_clicks_on_checkout_button() {
CartPage c=new CartPage(driver);
c.setCheckout();
}

@Then("checkout page should be displayed")
public void checkout_page_should_be_displayed() {
	System.out.println(driver.getCurrentUrl());
}

@When("he enters the first name as {string}")
public void he_enters_the_first_name_as(String firstName) {
	c1=new CheckoutPage1(driver);
	c1.setFirstName(firstName);
}

@And("he enters the last name as {string}")
public void he_enters_the_last_name_as(String lastName) {
	c1.setlastName(lastName);
}

@And("he enters the zip code as {string}")
public void he_enters_the_zip_code_as(String zipCode) {
	c1.setZipCode(zipCode);
}

@And("he clicks on continue button")
public void he_clicks_on_continue_button() {
	c1.setContinue();
}

@Then("checkout step two page should be displayed")
public void checkout_step_two_page_should_be_displayed() {
	System.out.println(driver.getCurrentUrl());
	c2=new CheckoutPage2(driver);
	String itemTotalNumber = c2.getItemTotal();
	String tax = c2.getTax();
	String summaryTotal = c2.getNettTotal();
	System.out.println(itemTotalNumber);
	System.out.println(tax);
	System.out.println(summaryTotal); 
}

@When("he clicks on finish button")
public void he_clicks_on_finish_button() {
	c2.setFinish();
}

@Then("checkout complete page should be displayed")
public void checkout_complete_page_should_be_displayed() {
	System.out.println(driver.getCurrentUrl());
	CheckoutCompletePage c3=new CheckoutCompletePage(driver);
	String orderConfirmedText = c3.getCompleteHeader().getText();
	System.out.println(orderConfirmedText); 
	boolean res = c3.getCompleteHeader().isDisplayed();
	Assert.assertTrue(res,"Header is not displayed");
}

}
