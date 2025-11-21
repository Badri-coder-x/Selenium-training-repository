import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class p33_readExcel {
	public static void main(String[] args) throws InterruptedException {
		String excelFilePath = "C:\\Excelfiles\\logincred.xls";
		Workbook workbook = null;
		try {
			File file = new File(excelFilePath);
			workbook = workbook.getWorkbook(file);
			Sheet sheet = workbook.getSheet(0);
			int numRows = sheet.getRows();
			int numCols = sheet.getColumns();
			
			
			
			for(int row = 1; row<numRows;row++) {
				WebDriver driver = new EdgeDriver();
				driver.get("http://demowebshop.tricentis.com");
				driver.findElement(By.linkText("Log in")).click();
				for(int col=0;col<numCols;col++) {
					
					Cell cell  = sheet.getCell(col,row);
					String cellContent = cell.getContents();
					
					if(col == 0) {
						driver.findElement(By.id("Email")).sendKeys(cellContent);
					}
					if(col == 1) {
						driver.findElement(By.id("Password")).sendKeys(cellContent);
					}
					Thread.sleep(2000);
					
					
					
				}
				driver.quit();
			}
		}
		
		catch (BiffException e) {
			System.err.println("Error reading Excel file (BiffException): "+e.getMessage());
		}
		catch(IOException e) {
			System.err.println("Error reading Excel file (IOException): "+e.getMessage());
		}
		finally {
			if(workbook != null) {
				workbook.close();
			}
			
		}
		
	}
}	