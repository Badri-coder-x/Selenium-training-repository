package Day2practicals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class e10_program {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://petstore.octoperf.com/");
		driver.findElement(By.linkText("Enter the Store")).click();
		List data= driver.findElements(By.xpath("//div[@id='MainImageContent']//img"));
		int count = data.size();
		System.out.println("count= "+count);
		Thread.sleep(3000);
		driver.quit();
	}
}
