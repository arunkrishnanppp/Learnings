package ASSIGNMENT2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_test_login extends excel_io_arr {
public String login() {
	String a_result;
	
	System.setProperty("webdriver.chrome.driver","chromedriver_78.exe");
	WebDriver dr=new ChromeDriver();
	dr.get("http://demowebshop.tricentis.com/login");
	dr.findElement(By.xpath("//input[@class='email']")).sendKeys(testdata[rowno][0]);
	dr.findElement(By.xpath("//input[@class='password']")).sendKeys(testdata[rowno][1]);
	
	dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	
	
	
	a_result=dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
	
	
	
	
	return a_result;
	
	
	
}
	
	
}
