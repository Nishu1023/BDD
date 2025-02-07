package generics;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.BaseClass;

public class WebDriverUtils {
	WebDriver driver=BaseClass.driver;
	/**
	 * This is generic method to assert the current URL is containing the mentioned partial URL
	 * @param expectedUrl
	 */
public void verifyUrl(String expectedUrl) {
	String actualUrl = driver.getCurrentUrl();
	boolean res = actualUrl.contains(expectedUrl);
	Assert.assertTrue(res,"The mentioned url is not present in the current URL");
	}
}
