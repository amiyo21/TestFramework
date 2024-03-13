package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Generic_FetchDataExcel 
{
	@Test
	public static String getData(String file_name,String sheet_name,int ro,int c)
	{
		FileInputStream fis;
		Workbook book=null;
		try
		{
			fis=new FileInputStream(file_name);
			book= WorkbookFactory.create(fis);
			
		} catch (Exception e)
		{
			System.out.println("File Not Found");
			e.printStackTrace();
		}
		
		Sheet sh = book.getSheet(sheet_name);
		Row r = sh.getRow(ro);
		Cell cel = r.getCell(c);
		String value = cel.toString();
		return value;
	}


}
