package JpetstorePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	WebDriver driver;
	WebElement register, login;
	
	public homePage(WebDriver driver){
		this.driver = driver;
		
	}
	
	public void clickRegister() {
		driver.findElement(By.linkText("Enter the Store")).click();
		driver.findElement(By.linkText("Sign In")).click();
		register =driver.findElement(By.linkText("Register Now!"));
		register.click();
	}
	
	public void clickLogin() {
		driver.findElement(By.linkText("Enter the Store")).click();
		login = driver.findElement(By.linkText("Sign In"));
		login.click();
	}
}
