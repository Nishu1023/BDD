package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Flipkart {
	WebDriver driver;

	@Given("user should be present in flipkart home page")
	public void user_should_be_present_in_flipkart_home_page() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
	}

	@When("he searches for iphone")
	public void he_searches_for_iphone() {
		driver.findElement(By.name("q")).sendKeys("iphone"+Keys.ENTER);
	}

	@Then("iphone search page should be displayed")
	public void iphone_search_page_should_be_displayed() {
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
