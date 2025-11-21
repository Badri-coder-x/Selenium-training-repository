package Day1practicals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class e1_openTheAppandVerifyTitle {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://advantageonlineshopping.com/");
		String title = driver.getTitle();
		System.out.println("Is title is Advantage Shopping: "+title.contains("Advantage Shopping"));
		Thread.sleep(5000);
		driver.close();
	}
}
