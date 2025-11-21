package saucedemo.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import saucedemo.pageObjects.cartPage;
import saucedemo.pageObjects.loginPage;
import saucedemo.pageObjects.productPage;

public class tc2_buymultipleitems {
	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new EdgeDriver();
		
		driver.get("https://saucedemo.com");
		
		loginPage login = new loginPage(driver);
		
		login.login("standard_user", "secret_sauce");
		
		Thread.sleep(3000);
		
		productPage prod = new productPage(driver);
		prod.verifyItemExists("Sauce Labs Backpack");
		
		Thread.sleep(2000);
		
		prod.addToCart();
		
		Thread.sleep(2000);
		
		prod.goToShopping();
		
		Thread.sleep(2000);
		
		prod.verifyItemExists("Sauce Labs Bolt T-Shirt");
		
		Thread.sleep(2000);
		
		prod.addToCart();
		
		Thread.sleep(2000);
		
		cartPage ct = new cartPage(driver);
		Thread.sleep(2000);
		
		ct.goToCart();
		ct.checkOut("Steve", "Rogers", "629002");
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}
}
