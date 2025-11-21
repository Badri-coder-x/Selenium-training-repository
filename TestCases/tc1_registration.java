package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PageObjects.homePage;
import PageObjects.registerPage;

public class tc1_registration {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("http://demowebshop.tricentis.com");
		homePage home  = new homePage(driver);
		home.clickRegister();
		registerPage register  = new registerPage(driver);
		register.enterFirstName("sample firstname");
		register.enterLastName("sample lastname");
		Thread.sleep(3000);
		home.clickLogin();
		Thread.sleep(3000);
		
		driver.quit();
	}
}
