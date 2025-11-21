import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class p25_absoluteXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		WebElement register = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/input"));
		register.sendKeys("Hello");
		Thread.sleep(4000);
		driver.quit();
		
	}
}
