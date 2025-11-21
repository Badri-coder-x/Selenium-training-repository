package grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class standalone {
	static WebDriver driver;
	static String nodeURL;
	public static void main(String[] args) {
		
		nodeURL = "";
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(platfrom.WINDOWS);
		
	}
}
