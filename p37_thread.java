import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class p37_thread {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("http://demowebshop.tricentis.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("abc");
		Thread.sleep(2000);
		driver.quit();
		
	}
}
