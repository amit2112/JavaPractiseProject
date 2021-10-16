package stringTest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fileHandling_XLS {
	static File f = new File("E:\\FileHandling\\Book1.xlsx");
	static DataOutputStream dos;
	static DataInputStream dis;
	static FileInputStream fis;

	public static void fileRead() throws IOException, FileNotFoundException {
		
		try {
			fis = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Sheet1"); 
			  
            // Iterate through each rows one by one 
            Iterator<Row> rowIterator = sheet.iterator(); 
            while (rowIterator.hasNext()) { 
                Row row = rowIterator.next(); 
                // For each row, iterate through all the columns 
                Iterator<Cell> cellIterator = row.cellIterator(); 
  
                while (cellIterator.hasNext()) { 
                    Cell cell = cellIterator.next(); 
                    // Check the cell type and format accordingly 
                    switch (cell.getCellType()) { 
                    case NUMERIC: 
                        System.out.print(cell.getNumericCellValue() + "\t"); 
                        break; 
                    case STRING: 
                        System.out.print(cell.getStringCellValue() + "\t"); 
                        break; 
                    } 
                  } 
                System.out.println("");
               } 

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			fis.close();
		}
	}

	public static void main(String[] args) throws IOException {
		fileRead();
	}
}
