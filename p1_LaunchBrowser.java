import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class p1_LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new EdgeDriver();
		String s;
		driver.get("http://google.com");
		s = driver.getTitle();
		System.out.println(s);
		driver.quit();
	}

}
