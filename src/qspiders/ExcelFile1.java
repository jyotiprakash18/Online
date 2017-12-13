package qspiders;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile1 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("E:/Book1.xlsx");
		Workbook wb=new XSSFWorkbook(fis);
		Sheet s=wb.getSheet("Sheet1");
		Row r= s.getRow(0);
		Cell c=r.getCell(0);
		String v=c.getStringCellValue();
		System.out.println(v);
	}
}