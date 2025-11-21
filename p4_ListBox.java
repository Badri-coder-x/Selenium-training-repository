import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class p4_ListBox {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://blazedemo.com");
		Select flyfrom  = new Select(driver.findElement(By.name("fromPort")));
		int count = flyfrom.getOptions().size();
		System.out.println("Total departure city "+ count);
		driver.quit();

	}

}
