import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class p17_byID {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement search  = driver.findElement(By.id("small-searchterms"));
		search.sendKeys("dummy items");
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@value='Search']"));
		searchbox.click();
		Thread.sleep(4000);
		driver.quit();
		
	}
}
