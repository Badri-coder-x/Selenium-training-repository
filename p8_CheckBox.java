import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class p8_CheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		boolean expValue = false, actValue;
		WebElement rembername = driver.findElement(By.id("RememberMe"));
		actValue = rembername.isSelected();
		Thread.sleep(2000);
		if(expValue == actValue) {
			System.out.println("Test is pass");
			rembername.click();
		}
		else {
			System.out.println("Test is fail");
		}
		Thread.sleep(5000);
		driver.quit();
	}
}
