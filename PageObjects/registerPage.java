package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerPage {
	WebDriver driver;
	WebElement firstName, lastName, email, password;
	
	public registerPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void enterFirstName(String s) {
		firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys(s);
	}
	
	public void enterLastName(String s) {
		lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys(s);
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
