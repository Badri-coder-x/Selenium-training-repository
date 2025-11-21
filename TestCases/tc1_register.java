package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PageObjects.homePage;
import PageObjects.registerPage;

public class tc1_register {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("http://demo.opencart.com/");
		homePage home  = new homePage(driver);
		home.clickRegister();
		registerPage register  = new registerPage(driver);
		register.enterFirstName("sample firstname");
		register.enterLastName("sample lastname");
		register.enterEmail("user23@gmail.com");
		register.enterPassword("saasdasda");
		Thread.sleep(3000);
		
		driver.quit();
	}
}
