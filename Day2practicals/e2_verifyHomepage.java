package Day2practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class e2_verifyHomepage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.blazedemo.com");
		WebElement fromport = driver.findElement(By.tagName("h1"));
		System.out.println(fromport.getText().equals("Welcome to the Simple Travel Agency!"));
		Thread.sleep(3000);
		driver.quit();
	}
}
