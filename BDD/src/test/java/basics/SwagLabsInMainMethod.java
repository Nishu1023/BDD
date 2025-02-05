package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwagLabsInMainMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.saucedemo.com/v1/index.html"); 
	driver.findElement(By.id("user-name")).sendKeys("standard_user"); 
	driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
	driver.findElement(By.id("login-button")).click(); 
	WebElement dropdown = driver.findElement(By.className("product_sort_container")); 
	Select s=new Select(dropdown);
	s.selectByIndex(2);
	driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click(); 
String itemsAdded = driver.findElement(By.xpath("//div[@id='shopping_cart_container']/descendant::span")).getText();
System.out.println(itemsAdded+" items has been added to the cart");	
driver.findElement(By.id("shopping_cart_container")).click(); 
	driver.findElement(By.linkText("CHECKOUT")).click(); 
	driver.findElement(By.id("first-name")).sendKeys("Ram"); 
	driver.findElement(By.id("last-name")).sendKeys("Shyam"); 
	driver.findElement(By.id("postal-code")).sendKeys("560085"); 
	driver.findElement(By.xpath("//input[@value='CONTINUE']")).submit(); 
	String[] itemTotal = driver.findElement(By.className("summary_subtotal_label")).getText().split(":");
	String itemTotalNumber = itemTotal[1];
	String tax = driver.findElement(By.className("summary_tax_label")).getText();
	String summaryTotal = driver.findElement(By.className("summary_total_label")).getText();
	System.out.println(itemTotalNumber);
	System.out.println(tax);
	System.out.println(summaryTotal); 
	driver.findElement(By.linkText("FINISH")).click(); 
	String orderConfirmedText = driver.findElement(By.className("complete-header")).getText();
	System.out.println(orderConfirmedText); 
	driver.findElement(By.xpath("//button[text()='Open Menu']")).click(); 
	driver.findElement(By.id("logout_sidebar_link")).click(); 
	driver.quit();
}
}
