package Day2practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class e1_identifyDepartureCity {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.blazedemo.com");
		WebElement fromport = driver.findElement(By.name("fromPort"));
		WebElement fromport2 = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
