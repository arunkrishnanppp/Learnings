package SDAY3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class AUT_LOGIN {

	public static login lo;
	public static login excel_read() {
		lo=new login();
	try {
		File f=new File("pss.xlsx");
		FileInputStream fii=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fii);
		XSSFSheet sh=wb.getSheet("sheet2");
		XSSFRow  r=sh.getRow(2);
		XSSFCell c=r.getCell(0);
		lo.uid=c.getStringCellValue();
		XSSFCell c1=r.getCell(1);
		lo.pass=c1.getStringCellValue();
		XSSFCell c2=r.getCell(2);
		lo.ex_r=c2.getStringCellValue();
	}catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
		
		return lo;
	}
	
	
	
	
	
	
	
	private static void login() {
		
		
		System.out.println(lo.uid);
		// TODO Auto-generated method stub
		String link="http://demowebshop.tricentis.com/";
		System.setProperty("webdriver.chrome.driver","chromedriver_78.exe");
		WebDriver dr=new ChromeDriver();
		dr.get(link);
		
		//ico-login
		
		String exp="buenhomber@gmail.com";
		dr.findElement(By.className("ico-login")).click();
		
		dr.findElement(By.className("email")).sendKeys(lo.uid);
		dr.findElement(By.className("password")).sendKeys(lo.pass);
		String s="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input";
		//class="button-1 login-button"
				dr.findElement(By.xpath(s)).click();		
				
				
				
				
				lo.ac_r=dr.findElement(By.className("account")).getText();
				if(lo.ex_r.equals(lo.ac_r)) {
					System.out.println("PASS");
					lo.test_r="PASS";}
				else {
					System.out.println("FAIL");
					lo.test_r="FAIL";
				}
		write();
	}
	
	
	
	private static void write() {
		// TODO Auto-generated method stub
		
		
		
		try {
			File f=new File("pss.xlsx");
			FileInputStream fii=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fii);
			XSSFSheet sh=wb.getSheet("sheet2");
			XSSFRow r=sh.getRow(2);
			XSSFCell c=r.createCell(3);
			c.setCellValue(lo.ac_r);
			XSSFCell c1=r.createCell(4);
			c1.setCellValue(lo.test_r);
			
			
			
			FileOutputStream foo=new FileOutputStream(f);
			wb.write(foo);
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}







	public static void main(String args[]) {
		
		excel_read();
		login();
		
		
	}












	
	
	
	
	
	
}
