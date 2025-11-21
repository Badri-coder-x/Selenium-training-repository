package PageObjects;

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
		driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a/span")).click();
		register = driver.findElement(By.linkText("Register"));
		register.click();
	}
	
	public void clickLogin() {
		driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a/span")).click();
		login = driver.findElement(By.linkText("Login"));
		login.click();
	}
	
}
