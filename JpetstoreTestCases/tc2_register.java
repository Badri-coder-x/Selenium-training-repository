package JpetstoreTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import JpetstorePageObjects.homePage;
import JpetstorePageObjects.registerPage;

public class tc2_register {
	public static void main(String[] args) throws InterruptedException {
WebDriver driver  = new EdgeDriver();
		
		driver.get("https://petstore.octoperf.com/");
		homePage home  = new homePage(driver);
		home.clickRegister();
		
		registerPage register = new registerPage(driver);
		register.enterUsername("dsfasda");
		register.enterPassword("asdadafc");
		register.enterRepeatedPassword("asdadafc");
		
		Thread.sleep(5000);
		driver.quit();
	}
}
