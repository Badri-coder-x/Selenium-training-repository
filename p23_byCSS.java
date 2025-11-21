import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class p23_byCSS {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		WebElement email = driver.findElement(By.cssSelector("input#Email"));
		email.sendKeys("asda@gmail.com");
		Thread.sleep(3000);
		driver.quit();
	}
}
