import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class p35_headlessbrowser {
	public static void main(String[] args) {
		HtmlUnitDriver driver  = new HtmlUnitDriver();
		driver.get("http://www.google.co.in");
		String s = driver.getTitle();
		System.out.println(s);
		driver.quit();
	}
}
