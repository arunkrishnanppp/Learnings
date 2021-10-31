package SDAY6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class excel_operations {

	public String read_excel(int r, int i) {
		// TODO Auto-generated method stub
		String s=null;
		
		
		try {
			File f1=new File("WebElement.xlsx");
			//File  f=new File("C:\\Gltraining\\Book1.x");
			
			FileInputStream fi=new FileInputStream(f1);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFSheet sh=wb.getSheet("sheet1");
			XSSFRow row=sh.getRow(r);
			XSSFCell c=row.getCell(i);
            s=c.getStringCellValue();
			
			


			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
