package JpetstoreTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import JpetstorePageObjects.homePage;
import JpetstorePageObjects.loginPage;

public class tc1_login {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = new EdgeDriver();
		
		driver.get("https://petstore.octoperf.com/");
		homePage home  = new homePage(driver);
		home.clickLogin();
		
		loginPage login = new loginPage(driver);
		login.enterUsername("dsfasda");
		login.enterPassword("asdadafc");
		
		Thread.sleep(5000);
		driver.quit();
	}
}
