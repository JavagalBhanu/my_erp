package generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


//if class contains only static method , then it is better to declare it as
//abstract
public abstract class ExcelUtil 
{
	//if the method is not accessing any non-static member then
	//it should be declared as static
  public static String getData(String path,String sheet,int r,int c)
  {
	  String value="";
	  try(Workbook wb=WorkbookFactory.create(new FileInputStream(path)))
	  {
		  value=wb.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
	  }
	  catch (Exception e) 
	  {
		  e.printStackTrace();
	 }
	  return value;
  }
}
