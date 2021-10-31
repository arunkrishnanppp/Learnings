package ASSIGNMENT2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_io_arr {
	public static String filename="DDFW_DATA.xlsx";
	public static String[][]testdata;
	public static int rowno,colno;
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
testdata=new String[2][3];
for(rowno=1;rowno<=2;rowno++) {
	get_test_data();
	basic_test_login lo=new basic_test_login();
	lo.login();
	
	
}
		System.out.println("Display Test Data");
	//	display_test_data();
		
		
		
		
		
	}
*/
	public static void get_test_data() {
		// TODO Auto-generated method stub
		
		
		System.out.println("in get data method");
		

		try {
			File f=new File(filename);
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFSheet sh=wb.getSheet("sheet1");
			XSSFRow r=sh.getRow(rowno);
			
			XSSFCell c=r.getCell(0);
			
			System.out.println(c.getStringCellValue());
			testdata[rowno-1][0]=c.getStringCellValue();
			
			
			
			XSSFCell c1=r.getCell(1);
			System.out.println(c1.getStringCellValue());
			testdata[rowno-1][1]=c1.getStringCellValue();
			
			
			XSSFCell c2=r.getCell(2);
			System.out.println(c2.getStringCellValue());
			testdata[rowno-1][2]=c2.getStringCellValue();
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
