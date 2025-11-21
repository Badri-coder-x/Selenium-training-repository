import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class p_relativeLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("http://demowebshop.tricentis.com");
		
		driver.findElement(By.linkText("Log in")).click();
		WebElement lblEmail = 
				driver.findElement(By.xpath("//label[@for='Email']"));
		
		WebElement txtUsername = 
				driver.findElement(with(By.tagName("input")).toRightOf(lblEmail));
		
		txtUsername.sendKeys("abc");
		Thread.sleep(5000);
		
		WebElement txtPassword = driver.findElement(with(By.tagName("input")).below(txtUsername));
		txtPassword.sendKeys("pass123");
		Thread.sleep(5000);
		driver.quit();
		
		
	}
}
