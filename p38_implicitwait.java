import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class p38_implicitwait {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		//implicit will be given in the beginning
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://demowebshop.tricentis.com");
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys("abc");
		driver.findElement(By.id("LastName")).sendKeys("abc");
		driver.quit();
	}
}
