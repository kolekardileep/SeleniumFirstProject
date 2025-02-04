package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingSingleDataFromExcel {

	public static void main(String[] args) throws Throwable {
	
		//step1:- path connections
FileInputStream fis = new FileInputStream("C:\\Users\\dilee\\JuneProjects\\Online\\src\\main\\resources\\ExcelTestData.xlsx");
	   
       //step2:-open workbook in read mode
	Workbook book = WorkbookFactory.create(fis);
	
	  //step3:-get the control of the Sheet
	Sheet sheet = book.getSheet("Sheet2");
	
	//step4:- get control of the row
	Row row = sheet.getRow(6);
	
	//step5:- get control of the cell
	Cell cell = row.getCell(4);
	
	String ExcelData = cell.getStringCellValue();
	System.out.println(ExcelData);
	
}

}
