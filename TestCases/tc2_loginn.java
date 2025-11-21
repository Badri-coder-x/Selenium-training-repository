package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PageObjects.homePage;
import PageObjects.loginPage;

public class tc2_loginn {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("http://demo.opencart.com");
		Thread.sleep(10000);
		homePage home  = new homePage(driver);
		home.clickLogin();
		loginPage login = new loginPage(driver);
		login.enterEmail("sample@gmail.com");
		login.enterPassword("sample password");
		Thread.sleep(3000);
		
		
		driver.quit();
	}
}
