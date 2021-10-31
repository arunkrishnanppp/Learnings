package SDAY6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_login extends login_data
{
public static login_data login (login_data ld) {
	
	
	
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
			{System.out.println("LOGIN FAILED");
				ld.act_res1="FAILURE";
/*String s1="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span";
String s2="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/ul/li";
				ld.act_em1=dr.findElement(By.xpath(s1)).getText();
				ld.act_em2=dr.findElement(By.xpath(s2)).getText();
				System.out.println("____ACTUAL AND EXPECTED");*/
				/*
				System.out.println(ld.act_em1);
				System.out.println(ld.exp_em1);
				System.out.println(ld.act_em2);
				System.out.println(ld.exp_em2);
				
				*/
				
			/*	if(ld.act_em2.equals(ld.exp_em2))
					System.out.println("HHHGKHGVUVUVIV");
				System.out.println("_______________________");*/
				dr.close();	
			}
			
	return ld;
}
	
	
	
	
	
	
	
	
	
	
	
	
}
