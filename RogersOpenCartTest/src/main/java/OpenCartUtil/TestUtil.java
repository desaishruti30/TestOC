package OpenCartUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.hssf.usermodel.HSSFSheet;  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.FormulaEvaluator;  
import org.apache.poi.ss.usermodel.Row;  
import OpenCartBase.TestBase;

public class TestUtil extends TestBase {
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	

	public static String TESTDATA_SHEET_PATH = "C:/Selenium_Workspace/RogersOpenCartTest/src/main/java/OpenCartTestData/OpenCartTestData.xlsx";	

	static Workbook book;
	static Sheet sheet;
	
	/*public void switchToFrame() {
		driver.switchTo().frame(framename);
	}*/
	
	
	public static Object[][] getTestData(String sheetName){
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			//	data[i][k] = sheet.getRow(i).getPhysicalNumberOfCells().toString()
						
				 System.out.println(data[i][k]);
				
				
			}
		}
		return data;
	}

	/*CSVReader readunamepass= new CSVReader(new FileReader("D:/My Projects New/DSP/Aut/Credentials.csv"));
    List<String[]> list = readunamepass.readAll();
    String[][] array = new String[list.size()][];
    for(int i=0;i<list.size();i++)
    {
        array[i] = list.get(i);
    }
    return array;
}
*/
	

	}
