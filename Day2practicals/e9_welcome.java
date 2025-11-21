package Day2practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class e9_welcome {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://petstore.octoperf.com/");
		WebElement welcome= driver.findElement(By.tagName("h2"));
		String msg = welcome.getText();
		System.out.println("Does the page have welcome page: "+msg.equals("Welcome to JPetStore 6"));
		Thread.sleep(3000);
		
		driver.quit();
	}
}
