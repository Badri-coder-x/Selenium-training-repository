import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class p7_SelectAllListBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://blazedemo.com");
		Select flyfrom  = new Select(driver.findElement(By.name("fromPort")));
		int count = flyfrom.getOptions().size();
		int i ;
		for(i=0;i<count;i++) {
			flyfrom.selectByIndex(i);
			Thread.sleep(2000);
		}
		Thread.sleep(5000);
		driver.quit();
	}
}
