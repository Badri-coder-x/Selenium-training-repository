import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



import jxl.Sheet;
import jxl.Workbook;
import zmq.ZError.IOException;

public class p34_ApachePOI {
	public static void main(String[] args) throws FileNotFoundException, java.io.IOException {

	
		try (FileInputStream file = new FileInputStream("C:\\Excelfiles\\loginCredApache.xlsx");
				XSSFWorkbook workbook = new XSSFWorkbook(file))
		{
				XSSFSheet sheet = workbook.getSheetAt(0);
				Iterator <Row> rowIterator = sheet.iterator();
				while(rowIterator.hasNext()) {
					Row row = rowIterator.next();
					Iterator<Cell> cellIterator = row.cellIterator();
					
					while(cellIterator.hasNext()) {
						Cell cell = cellIterator.next();
						switch (cell.getCellType()) {
						case STRING:
							System.out.print(cell.getStringCellValue() + "\t");
							break;
						case NUMERIC:
							System.out.print(cell.getNumericCellValue() + "\t");
							break;
						default:
							break;
						}
					}
					
					System.out.println();
				}
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	
	}
}
