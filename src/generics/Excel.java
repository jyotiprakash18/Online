package generics;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel 
{ 
 public static String getCellData(String xlpath,String sheet,int row,int cell) 
 { 
  String v=""; 
  try 
  { 
	   FileInputStream fis=new FileInputStream(xlpath); 
	   Workbook wb=new XSSFWorkbook(fis); 
	   v=wb.getSheet(sheet).getRow(row).getCell(cell).toString();  
  } 
  catch(Exception e) 
  { 
	  
  } 
  return v;  
 } 
   
 public static int getRowCount(String xlpath,String sheet) 
 { 
  int rc=0; 
  try 
  { 
	   FileInputStream fis=new FileInputStream(xlpath); 
	   Workbook wb=new XSSFWorkbook(fis); 
	   rc=wb.getSheet(sheet).getLastRowNum(); 
  } 
  catch(Exception e) 
  {
	  
  } 
  return rc; 
 } 
} 