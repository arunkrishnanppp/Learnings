package TESTING;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_test extends  excel_io_al{

	public static void main(String args[]) {
	read_list=new ArrayList<login_data>();
	ArrayList<login_data> list=new ArrayList<login_data>();
		get_test_data();
		int c=0;
		int count=1;
		login_data ld1=new login_data();
		
		
		
		
		
		
		
		
		for(login_data ld:read_list) {
			/*System.out.println(ld.uid);
			System.out.println(ld.pwd);
			System.out.println(ld.exp_re1);
			System.out.println(ld.exp_em1);
			System.out.println(ld.exp_em2);*/
			
			ld1=login(ld);
			//list.set(c, ld1);
			ld1.display();
			write_excel(count,ld1);
			System.out.println("*******************");
			System.out.println(count);
			count++;
		}		
		
		

}

	

	public static login_data login(login_data ld) {
		// TODO Auto-generated method stub
		String link="http://demowebshop.tricentis.com/";
		System.setProperty("webdriver.chrome.driver","chromedriver_78.exe");
		WebDriver dr=new ChromeDriver();
		dr.get(link);
		
		
		
		//String exp="buenhomber@gmail.com";
		System.out.println("&&&&&&&&&&&&&&&&&&&");
		System.out.println(ld.uid);
		System.out.println("*************");
		System.out.println(ld.pwd);
		dr.findElement(By.className("ico-login")).click();
		if(ld.uid==null) {dr.findElement(By.className("email")).sendKeys(" ");}
		else
		dr.findElement(By.className("email")).sendKeys(ld.uid);
		
		
		if(ld.pwd==null) {dr.findElement(By.className("password")).sendKeys(" ");}
		else
		dr.findElement(By.className("password")).sendKeys(ld.pwd);
		String s="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input";
		//class="button-1 login-button"
				dr.findElement(By.xpath(s)).click();	
				
				
				boolean f=dr.getTitle().contains("Login");
				
				
				if(!f) {
					
					ld.act_res1="SUCCESS";
					System.out.println("Login sucess");
					dr.close();
					
					
				}
				
				else
				{
					ld.act_res1="FAILURE";
String s1="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span";
String s2="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/ul/li";
					ld.act_em1=dr.findElement(By.xpath(s1)).getText();
					ld.act_em2=dr.findElement(By.xpath(s2)).getText();
					System.out.println("____ACTUAL AND EXPECTED");
					
					System.out.println(ld.act_em1);
					System.out.println(ld.exp_em1);
					System.out.println(ld.act_em2);
					System.out.println(ld.exp_em2);
					
					
					
					if(ld.act_em2.equals(ld.exp_em2))
						System.out.println("HHHGKHGVUVUVIV");
					System.out.println("_______________________");
					dr.close();	
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				if(ld.exp_re1.equals(ld.act_res1)) {
					
					
				if(ld.exp_re1.equals("FAILURE")) {
					System.out.println("EXP ER 1:"+ld.exp_em1+"\nACT_RE :"+ld.act_em1+"\nEXP_ER_2:"+ld.exp_em2
							+"\nACT_ER:"+ld.act_em2);
					
					
					
					
					if(ld.exp_em1.equals(ld.act_em1)&&ld.exp_em2.equals(ld.act_em2)) {
						System.out.println("in the pass case");
						ld.test_res="PASS";}
					else {
						System.out.println("in the fail case");
						ld.test_res="FAIL";}
					//dr.close();
				}
				else 
					ld.test_res="PASS";
					
			
				
				
				}
				else {
					
					try {
					if(ld.exp_em1.equals(ld.act_em1)&&ld.exp_em2.equals(ld.act_em2)&&ld.exp_re1.equals(ld.act_res1))
						ld.test_res="PASS";
					else
						ld.test_res="FAIL";
					}catch(NullPointerException e) {
						ld.test_res="YOU ARE WRITTEN EXPECTED RESULT AS FAILURE FOR VALID VALID CASE";
						System.out.println("ERROR IN CODE");
						System.out.println("YOU ARE WRITTEN EXPECTED RESULT AS FAILURE FOR VALID VALID CASE");
					}
					
					/*ld.test_res="PASS";*/
					/*ld.exp_em1=null;
					ld.exp_em2=null;*/
					if(ld.act_res1.equals("SUCCESS"))
					dr.findElement(By.className("ico-logout")).click();
					
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//dr.close();	
				}
				System.out.println(ld.test_res);
				return ld;
				
		
		
	}
		
}