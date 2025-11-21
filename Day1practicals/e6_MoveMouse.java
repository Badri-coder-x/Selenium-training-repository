package Day1practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class e6_MoveMouse {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement computers = driver.findElement(By.linkText("COMPUTERS"));
		Actions action  = new Actions(driver);
		
		action.moveToElement(computers).build().perform();
		WebElement notebooks = driver.findElement(By.linkText("Notebooks"));
		Thread.sleep(2000);
		notebooks.click();
//		Thread.sleep(2000);
		
		Select products = new Select(driver.findElement(By.id("products-orderby")));
		int count = products.getOptions().size();
		
		int i=0;
		for(i=0;i<count;i++) {
			Select products1 = new Select(driver.findElement(By.id("products-orderby")));
			products1.selectByIndex(i);
//			Thread.sleep(5000);
		}
		Thread.sleep(5000);
		
		
		driver.quit();
	
	
	}
}
