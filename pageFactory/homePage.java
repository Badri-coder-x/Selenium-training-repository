package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class homePage {
	WebDriver driver;
	
	homePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Register")
	WebElement register;
	
	@FindBy(linkText="Log in")
	WebElement login;
	
	public void clickLogin() {
		login.click();
	}
	public void clickRegister() {
		register.click();
	}
}
