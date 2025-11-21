package Day1practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class e7_addToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver  = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement books = driver.findElement(By.linkText("BOOKS"));
		books.click();
		Thread.sleep(2000);
		WebElement product = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[1]/a/img" ));
		
		
		driver.quit();

	}

}
