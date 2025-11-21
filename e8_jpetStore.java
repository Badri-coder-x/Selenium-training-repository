import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class e8_jpetStore {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://petstore.octoperf.com/");
		driver.findElement(By.xpath("//a[@href='actions/Catalog.action']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
