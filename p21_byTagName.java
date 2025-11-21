import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class p21_byTagName {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> allimages = driver.findElements(By.tagName("img"));
		int total = allimages.size();
		System.out.println("Total no of images= "+total);
		
		List<WebElement> allanchor = driver.findElements(By.tagName("a"));
		int totala = allanchor.size();
		System.out.println("Total no of links are= "+totala);
		driver.quit();
	}
}
