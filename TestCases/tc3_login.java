package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PageObjects.homePage;
import pageFactory.loginPage;

public class tc3_login {
	public static void main(String[] args) {
		WebDriver driver  = new EdgeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		homePage home = new homePage(driver);
		home.clickLogin();
		loginPage login = new loginPage(driver);
		login.enterEmail("asdasda@gmail.com");
		login.enterPassword("sbsfagbsj");
		
		
	}
}
