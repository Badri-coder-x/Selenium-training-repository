package Day1practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class e2_program {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://advantageonlineshopping.com/");
		Thread.sleep(5000);
		WebElement speakers = driver.findElement(By.xpath("//div[@id='speakersImg']"));
		Thread.sleep(2000);
		speakers.click();
		Thread.sleep(5000);
		WebElement hproar = driver.findElement(By.xpath("//img[@id='22']"));
		Thread.sleep(5000);
		hproar.click();
		Thread.sleep(5000);
		WebElement pricetag = driver.findElement(By.xpath("//h2[@class='roboto-thin ng-binding']"));
//		Thread.sleep(5000);
		String price= pricetag.getText();
		
		
		driver.close();
	}
}
