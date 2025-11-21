package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerPage {
	WebDriver driver;
	
	public registerPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="FirstName")
	WebElement fname;
	
	@FindBy(linkText="LastName")
	WebElement lname;
	
	public void enterFirstName(String s) {
		fname.sendKeys(s);
	}
	
	public void enterLastName(String s) {
		lname.sendKeys(s);
	}
}
