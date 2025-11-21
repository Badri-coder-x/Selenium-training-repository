package Day2practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class e6_verifyTheLabel {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.blazedemo.com");
		driver.findElement(By.linkText("home")).click();
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("//div[@class='panel-heading']"));
		String ename = element.getText();
		
		System.out.println("Is login label present there: "+ename.equals("Login"));
		driver.quit();
	}
}
