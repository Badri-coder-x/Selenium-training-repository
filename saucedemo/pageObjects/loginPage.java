package saucedemo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	WebDriver driver;
	WebElement login, userName, passWord;
	
	public loginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void login(String s1, String s2) {
		userName = driver.findElement(By.name("user-name"));
		userName.sendKeys(s1);
		passWord = driver.findElement(By.name("password"));
		passWord.sendKeys(s2);
		driver.findElement(By.name("login-button")).click();
		
	}
	
	
	
	
	
	
}
