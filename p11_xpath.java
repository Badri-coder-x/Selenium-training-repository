import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class p11_xpath {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://petstore.octoperf.com/");
		driver.findElement(By.linkText("Enter the Store")).click();
		WebElement fish = driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']"));
		fish.click();
		Thread.sleep(5000);
		driver.quit();
		
	}
}
