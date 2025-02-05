package hooks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	public static WebDriver driver;
	@Before(order=0)
public void openBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.saucedemo.com/v1/index.html"); 
	Reporter.log("openBrowser",true);
}	@Before(order=1)
public void login() {
	driver.findElement(By.id("user-name")).sendKeys("standard_user"); 
	driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
	driver.findElement(By.id("login-button")).click(); 
	Reporter.log("login",true);
}	@After(order=1)
public void logout() {
	driver.findElement(By.xpath("//button[text()='Open Menu']")).click(); 
	driver.findElement(By.id("logout_sidebar_link")).click(); 
	Reporter.log("logout",true);
}	@After(order=0)
public void closeBrowser() {
	driver.quit();
	Reporter.log("closeBrowser",true);
}
}
