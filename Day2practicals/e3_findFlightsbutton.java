package Day2practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class e3_findFlightsbutton {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.blazedemo.com");
		WebElement button1 = driver.findElement(By.className("btn"));
		
		
		WebElement button2 = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		Thread.sleep(3000);
		driver.quit();
	}
}
