import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class p32_readCSV {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver;
		driver = new EdgeDriver();
		String datafile = "C:\\CSV files\\testdata.csv";
		BufferedReader br = null;
		
		String line = "";
		String cvSplitBy = ",";
		br = new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!= null) {
			String[] data = line.split(cvSplitBy);
			System.out.println(data[0]+" "+data[1]+" "+data[2]);
			driver.get("http://demowebshop.tricentis.com");
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("FirstName")).sendKeys(data[0]);
			driver.findElement(By.id("LastName")).sendKeys(data[1]);
			driver.findElement(By.id("Email")).sendKeys(data[2]);
			Thread.sleep(5000);
			driver.quit();
		}
		
	}
}
