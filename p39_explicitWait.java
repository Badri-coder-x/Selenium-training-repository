import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p39_explicitWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		//implicit will be given in the beginning
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement register;
		register = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Register")));
		register.click();
		Thread.sleep(5000);
		driver.quit();
		
	}
}
