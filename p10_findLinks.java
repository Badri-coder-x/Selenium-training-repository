import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class p10_findLinks {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> links = 
				driver.findElements(By.tagName("a"));
		System.out.println("Number of links: "+links.size());
		driver.quit();
	}
}
