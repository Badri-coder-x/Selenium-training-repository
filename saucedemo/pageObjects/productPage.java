package saucedemo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productPage {
	WebDriver driver;
	WebElement product;
	
	public productPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void verifyItemExists(String s) {
		try {
		product = driver.findElement(By.linkText(s));
		product.click();
		}
		catch(Exception e) {
			System.out.println("Element not exists!!!!");
		}
	}
	
	public void addToCart() {
		driver.findElement(By.xpath("//button[@name='add-to-cart']")).click();
		
	}
	
	public void goToShopping() {
		driver.findElement(By.xpath("//button[@name='back-to-products']")).click();
	}
	
	
	
	
}
