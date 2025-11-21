package JpetstorePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerPage {
	WebDriver driver;
	WebElement firstName, lastName, email, password;
	
	public registerPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void enterUsername(String s) {
		firstName = driver.findElement(By.xpath("//input[@name='username']"));
		firstName.sendKeys(s);
	}
	
	public void enterPassword(String s) {
		firstName = driver.findElement(By.xpath("//input[@name='password']"));
		firstName.sendKeys(s);
	}
	
	public void enterRepeatedPassword(String s) {
		firstName = driver.findElement(By.xpath("//input[@name='repeatedPassword']"));
		firstName.sendKeys(s);
	}
	
	
	
	
	
	
}
