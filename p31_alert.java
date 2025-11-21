import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class p31_alert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new EdgeDriver();
		driver.get("file:///C:/Websites/program1.html");
		driver.findElement(By.id("b1")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		System.out.println("Pop up msg= "+alert.getText());
		alert.accept();
		Thread.sleep(5000);
		
		driver.quit();
	}
}
