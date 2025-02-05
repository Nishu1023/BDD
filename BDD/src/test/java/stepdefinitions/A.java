package stepdefinitions;

import org.testng.Reporter;

import hooks.BaseClass;
import io.cucumber.java.en.Given;

public class A{

@Given("User is purchasing the product")
public void user_is_purchasing_the_product() {
	Reporter.log("User has purchased the product",true);
}
}
