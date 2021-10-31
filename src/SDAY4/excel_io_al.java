package SDAY4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_io_al extends login_data {
	//static ArrayList<login_data> list;
public static ArrayList<login_data> read_list;








public static ArrayList<login_data> get_test_data() {
	// TODO Auto-generated method stub
	read_list=new ArrayList<login_data>();
	
//list=new ArrayList<login_data>();
	
	//String s=null;
	
	
	
	try {
		File f=new File("webshop.xlsx");
		FileInputStream fii=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fii);
		XSSFSheet sh=wb.getSheet("sheet1");
		
		for(int i=1;i<sh.getLastRowNum();i++) {
			
			
			login_data dt=new login_data();
		XSSFRow  r=sh.getRow(i);
		XSSFCell c=r.getCell(0);
		//System.out.println(c.getStringCellValue());
		dt.uid=c.getStringCellValue();
		XSSFCell c1=r.getCell(1);
		dt.pwd=c1.getStringCellValue();
		XSSFCell c2=r.getCell(2);
		dt.exp_re1=c2.getStringCellValue();
		XSSFCell c3=r.getCell(3);
		//dt.exp_em1=c3.getStringCellValue();
		if(r.getCell(3)==null||r.getCell(3).getCellType()==Cell.CELL_TYPE_BLANK) {
			dt.exp_em1=null;
		}
		else
			dt.exp_em1=c3.getStringCellValue();
		
		XSSFCell c4=r.getCell(4);
		//dt.exp_em2=c4.getStringCellValue();
		if(r.getCell(4)==null||r.getCell(4).getCellType()==Cell.CELL_TYPE_BLANK) {
			dt.exp_em2=null;
		}
		else
			dt.exp_em2=c4.getStringCellValue();
		
		read_list.add(dt);
		}
		
	}catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} return read_list;
}


public static void write_excel(int i, login_data ld1) {
	// TODO Auto-generated method stub
	

	File f=new File("webshop.xlsx");
	FileInputStream fii;
	try {
		fii = new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fii);
		XSSFSheet sh=wb.getSheet("sheet1");
		XSSFRow r=sh.getRow(i);
		XSSFCell c=r.createCell(5);
		c.setCellValue(ld1.act_res1);
		if(ld1.act_res1.equals("FAILURE")) {
			XSSFCell c1=r.createCell(6);
			c1.setCellValue(ld1.act_em1);
			XSSFCell c2=r.createCell(7);
			c2.setCellValue(ld1.act_em2);
			
		}
		XSSFCell c3=r.createCell(8);
		c3.setCellValue(ld1.test_res);
		XSSFCell temp=r.createCell(3);
		
		temp.setCellValue(ld1.exp_em1);
		XSSFCell temp2=r.createCell(4);
	temp2.setCellValue(ld1.exp_em2);	
		
		FileOutputStream foo=new FileOutputStream(f);
		wb.write(foo);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	




}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
