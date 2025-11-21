package Day1practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class e5_demowebapp {
	public static void main(String[] args) {
		WebDriver driver  = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@src='/Themes/DefaultClean/Content/images/logo.png']"));
		String logoname = logo.getAttribute("src");
		System.out.println("does the src contains logo.png: "+logoname.contains("logo.png"));
		driver.quit();
	}
}
