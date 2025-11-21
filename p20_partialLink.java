import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class p20_partialLink {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.partialLinkText("cart"));
		cart.click();
		Thread.sleep(3000);
		driver.quit();
	}
}
