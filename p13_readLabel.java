import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class p13_readLabel {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		
		WebElement register = driver.findElement(By.xpath("//h1"));
		String regText = register.getText();
		System.out.println("The text is "+regText);
		driver.quit();
	}
}
