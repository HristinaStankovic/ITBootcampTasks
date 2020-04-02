package poi_biblioteke;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PoiDomaci {
	
	 public static void main (String [] args) throws FileNotFoundException {
			
			try {
				FileInputStream fi = new FileInputStream("src//poi_biblioteke//poi.xlsx");
				XSSFWorkbook wb = new XSSFWorkbook(fi);
				
				Double suma = 0d;
				
				for (int i = 0; i < 13; i++) {
					
					XSSFSheet sheet = wb.getSheetAt(0);
					Row row = sheet.getRow(i);
					Cell cell = row.getCell(0);
					
					String cells = cell.toString();
					Double a = Double.valueOf(cells);
					suma = suma + a;
					
				}
				
				System.out.println(suma);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }

}
