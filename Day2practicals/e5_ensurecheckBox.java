package Day2practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class e5_ensurecheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.blazedemo.com");
		driver.findElement(By.linkText("home")).click();
		Thread.sleep(3000);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@name='remember']"));
		if(checkbox.isSelected()) {
			System.err.println("Oops checkbox is selected");
		}else {
			System.out.println("Checkbox is not selected");
		}
		
		driver.quit();
		
	}
}
