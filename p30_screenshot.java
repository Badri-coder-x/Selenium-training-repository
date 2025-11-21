import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class p30_screenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement register = driver.findElement(By.linkText("Register"));
		File registerimg = register.getScreenshotAs(OutputType.FILE);
		File destinationimg = new File("C:\\TestResults\\screenshots\\register.jpeg");
		Files.copy(registerimg, destinationimg);
		driver.quit();
	}
}
