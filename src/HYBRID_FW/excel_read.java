package HYBRID_FW;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_read {
	static tc_selection sdata;
	
	static keyword_sh kdata;
	public static ArrayList<login_test_data> list=new ArrayList<login_test_data>();
	
	public static tc_selection read_sheet(int i) {
		// TODO Auto-generated method stub
		sdata=new tc_selection();
		kdata=new keyword_sh();
		
	
		try {
			File f=new  File("hybrid.xlsx");
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
	
	
	
	public static keyword_sh read_keyword_sh(int j) {
		// TODO Auto-generated method stub
		
		
		

		try {
			File f=new  File("hybrid.xlsx");
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

	
	
	public static void get_test_data(String test_data_sh) {
		
		int m=1;
		// TODO Auto-generated method stub
		
		try {
			File f=new  File("hybrid.xlsx");
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFSheet sh=wb.getSheet(test_data_sh);
			for(int i=1;i<=m;i++) {
			m=sh.getLastRowNum();
			login_test_data p=new login_test_data();
			
			XSSFRow r=sh.getRow(i);
			XSSFCell c=r.getCell(0);
			p.uid=c.getStringCellValue();
			XSSFCell c1=r.getCell(1);
			p.pwd=(String) c1.getStringCellValue();
			list.add(p);
		}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	public static void write_tc(int i, String string) {
		// TODO Auto-generated method stub
		
		

		try {
			File f=new  File("hybrid.xlsx");
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

	

	
	
	
	
	
	
	
	
	
	
	

