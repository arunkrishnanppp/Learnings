package KEYWORD_WITH_TC_SEL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import HYBRID_FW.keyword_sh;
import HYBRID_FW.tc_selection;



public class excel_operations {
	public static tc sdata=new tc();
	public static key kdata=new key();
	public String read_excel(int r, int i) {
		// TODO Auto-generated method stub
		String s=null;
		System.out.println(r);
		
		try {
			File f1=new File("exc1.xlsx");
			//File  f=new File("C:\\Gltraining\\Book1.x");
			
			FileInputStream fi=new FileInputStream(f1);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFSheet sh=wb.getSheet("KEYWORD");
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
		
		public void write_excl(String res,int r) {
			System.out.println(r);
			
			try {
				File f1=new File("exc1.xlsx");
				//File  f=new File("C:\\Gltraining\\Book1.x");
				
				FileInputStream fi=new FileInputStream(f1);
				XSSFWorkbook wb=new XSSFWorkbook(fi);
				XSSFSheet sh=wb.getSheet("KEYWORD");
				XSSFRow row=sh.getRow(r);
				XSSFCell c=row.createCell(6);
	            c.setCellValue(res);
				
				

	            FileOutputStream fo=new FileOutputStream(f1);
	            wb.write(fo);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
		}
		
		
		public static tc read_sheet(int i) {
			// TODO Auto-generated method stub
			
			
			
		
			try {
				File f=new  File("exc1.xlsx");
				FileInputStream fi=new FileInputStream(f);
				XSSFWorkbook wb=new XSSFWorkbook(fi);
				XSSFSheet sh=wb.getSheet("TC_SELECTION");
				XSSFRow r=sh.getRow(i);
				XSSFCell c=r.getCell(0);
				sdata.tcid=c.getStringCellValue();
				XSSFCell c1=r.getCell(1);
				sdata.flag=c1.getStringCellValue();
				XSSFCell c2=r.getCell(2);
				sdata.no_steps=(int) c2.getNumericCellValue();
				XSSFCell c3=r.getCell(3);
				sdata.test_data_sh=c3.getStringCellValue();
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
			return sdata;
		}
		public static key read_keyword_data(int j) {
			// TODO Auto-generated method stub
			try {
				File f=new  File("exc1.xlsx");
				FileInputStream fi=new FileInputStream(f);
				XSSFWorkbook wb=new XSSFWorkbook(fi);
				XSSFSheet sh=wb.getSheet("KEYWORD");
				XSSFRow r=sh.getRow(j);
				XSSFCell c=r.getCell(0);
				kdata.TC_ID=c.getStringCellValue();
				XSSFCell c1=r.getCell(1);
				kdata.step_no=(String) c1.getStringCellValue();
				XSSFCell c2=r.getCell(3);
				kdata.KeyWord=c2.getStringCellValue();
				XSSFCell c3=r.getCell(4);
				kdata.Xpath=c3.getStringCellValue();
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
			
			
			return kdata;
		}

		
		
		
		
		public static void write_tc(int i, String string) {
			// TODO Auto-generated method stub
			
			

			try {
				File f=new  File("exc1.xlsx");
				FileInputStream fi=new FileInputStream(f);
				XSSFWorkbook wb=new XSSFWorkbook(fi);
				XSSFSheet sh=wb.getSheet("TC_SELECTION");
				XSSFRow r=sh.getRow(i);
				XSSFCell c=r.createCell(4);
				
				c.setCellValue(string);
				
				
				FileOutputStream fo=new FileOutputStream(f);
						
				wb.write(fo);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
			
			
			//return kdata;
		}
			

		
		
		
		
		
		
		
		
		
	

}
