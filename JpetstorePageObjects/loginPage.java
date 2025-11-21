package JpetstorePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	WebDriver driver;
	WebElement username, password;
	
	public loginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void enterUsername(String s) {
		
		username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(s);
		
	}
	
	public void enterPassword(String s) {
		password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(s);
		
	}
}
