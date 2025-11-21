import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class p24_genRandom {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		WebElement email = driver.findElement(By.cssSelector("input#Email"));
		Random random = new Random();
		int randomno = random.nextInt(1000);
		String user = "tester";
		email.sendKeys(user+randomno+"@gmail.com");
		Thread.sleep(3000);
		driver.quit();
	}
}
