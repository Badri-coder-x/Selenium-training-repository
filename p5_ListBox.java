import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class p5_ListBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://blazedemo.com");
		Select flyfrom  = new Select(driver.findElement(By.name("fromPort")));
		flyfrom.selectByVisibleText("Mexico City");
		Thread.sleep(5000);
		driver.quit();
	}
}
