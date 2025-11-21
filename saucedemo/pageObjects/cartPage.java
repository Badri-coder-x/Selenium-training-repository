package saucedemo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartPage {
	WebDriver driver;
	WebElement product, fname, lname, zipCode;
	
	public cartPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void checkOut(String s1, String s2, String s3) {
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		fname = driver.findElement(By.name("firstName"));
		fname.sendKeys(s1);
		lname = driver.findElement(By.name("lastName"));
		lname.sendKeys(s2);
		zipCode = driver.findElement(By.name("postalCode"));
		zipCode.sendKeys(s3);
		driver.findElement(By.name("continue")).click();
		
	}
	
	public void goToCart() {
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	}
}
