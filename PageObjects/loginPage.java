package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	WebDriver driver;
	WebElement email, password;
	
	public loginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void enterEmail(String s) {
		
		email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys(s);
		
	}
	
	public void enterPassword(String s) {
		password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(s);
		
	}
	
}
