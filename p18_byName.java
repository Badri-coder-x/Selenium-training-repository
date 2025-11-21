import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class p18_byName {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver  = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement newsletter = driver.findElement(By.name("NewsletterEmail"));
		newsletter.sendKeys("dummy items");
		WebElement subscribe = driver.findElement(By.id("newsletter-subscribe-button"));
		subscribe.click();
		Thread.sleep(4000);
		driver.quit();
		
	}
}
