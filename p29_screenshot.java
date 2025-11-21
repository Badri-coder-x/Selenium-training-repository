import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class p29_screenshot {
	static WebDriver driver;
	static int i=1;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		driver = new EdgeDriver();
		driver.get("http://demowebshop.tricentis.com");
		takeScreenshot();
		driver.findElement(By.linkText("Register")).click();
		takeScreenshot();
		driver.findElement(By.id("FirstName")).sendKeys("abc");
		takeScreenshot();
		driver.findElement(By.id("LastName")).sendKeys("def");
		takeScreenshot();
		Thread.sleep(3000);
		
		driver.quit();
		
	}
	
	static void takeScreenshot() throws IOException{
		System.out.println("Taking screenshot");
		File scrFile;
		scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File("C:\\TestResults\\screenshots"+i+".jpeg"));
		i++;
		
	}
}
