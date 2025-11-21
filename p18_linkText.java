import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class p18_linkText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = new EdgeDriver();
		driver.get("https://www.google.com/");
		WebElement about = driver.findElement(By.linkText("About"));
		about.click();
		Thread.sleep(3000);
		driver.quit();
	}
}
