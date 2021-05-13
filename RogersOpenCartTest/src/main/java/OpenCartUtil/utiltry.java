package OpenCartUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import OpenCartBase.TestBase;

public class utiltry extends TestBase{
	
	
	public static String TESTDATA_SHEET_PATH = "C:/Selenium_Workspace/RogersOpenCartTest/src/main/java/OpenCartTestData/OpenCartTestData.xlsx";	

	static Workbook book;
	static Sheet sheet;
	
	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		 
	}
	
	ExcelSetup obj=new ExcelSetup(TESTDATA_SHEET_PATH);
	 public int getcolumncount(){
	        int colcount=0;
	        try{

	            colcount=sheet.getRow(0).getLastCellNum();
	            System.out.println("The total number of columns are "+colcount);

	        }catch (Exception e){
	            System.out.println("The error message is "+e.getMessage());
	            System.out.println("The cause of error is "+e.getCause());
	            e.getStackTrace();
	        }

	        return colcount;
	    }

	  public int getRowcount()  {
	        int rowCount=0;
	        try {
	             rowCount=sheet.getPhysicalNumberOfRows();
	            System.out.println("The total number of rows are "+rowCount);

	        }catch (Exception e){
	            System.out.println("The error message is "+e.getMessage());
	            System.out.println("The cause of error is "+e.getCause());
	            e.getStackTrace();
	        }

	        return rowCount;
	    }



	  public String getCellData(int rowNo, int colNo){
	        String strdata = null;
	        Double data=0.0;
	        cell=sheet.getRow(rowNo).getCell(colNo);
	        type=cell.getCellType();
	        if (type==CellType.STRING){
	           strdata=cell.getStringCellValue();
	        }

	        else if (type==CellType.NUMERIC){
	            cell.setCellType(CellType.STRING);
	            strdata=cell.getStringCellValue();
	        }
	        return strdata;
	    }
	  
	  Object[][]data=new Object[rowCount][colCount];

      for (int i = 1; i <rowCount ; i++) {
          for (int j = 0; j <colCount ; j++) {
           String cellData=obj.getCellData(i,j);
              System.out.print(cellData+" | ");
              data[i-1][j]=cellData;
          }
	  
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
				
				
			}
		}
		return data;
}


}
