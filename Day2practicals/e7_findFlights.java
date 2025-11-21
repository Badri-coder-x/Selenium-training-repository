package Day2practicals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class e7_findFlights {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.blazedemo.com");
		WebElement button2 = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		button2.click();
		Thread.sleep(3000);
		
		List<WebElement> allanchor = driver.findElements(By.xpath("//input[@value='Choose This Flight']"));
		System.out.println(allanchor.size());
		
		driver.quit();
	}
}
