package stepdefinitions;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginToHRM {
	WebDriver driver;
	@Given("User enters the url as {string}")
	public void user_enters_the_url_as(String url) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
	}	@When("User enters username as {string}")
	public void user_enters_username_as(String un) {
		driver.findElement(By.name("username")).sendKeys(un);	}
	@And("He enters the password as {string}")
	public void he_enters_the_password_as(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	}@And("He click on login button")
	public void he_click_on_login_button() {
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}@Then("Home Page Should be displayed")
	public void home_page_should_be_displayed() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		System.out.println(js.executeScript("return document.title"));
		String url = (String) js.executeScript("return document.URL");
		System.out.println(url);
	}

}
