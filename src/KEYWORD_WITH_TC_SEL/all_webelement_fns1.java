package KEYWORD_WITH_TC_SEL;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_webelement_fns1 {

	
	WebDriver dr;
	public all_webelement_fns1(WebDriver dr2) {
		// TODO Auto-generated constructor stub
		this.dr=dr;
	}
	
	public void enter_txt(String xp,String data) {
		System.out.println(xp+"" +data);
		dr.findElement(By.xpath(xp)).sendKeys(data);
	}
	public void clicklink(String xp) {
		dr.findElement(By.xpath(xp)).click();
	}
	public void verify(String xp,String exp,int r) {
		String out=dr.findElement(By.xpath(xp)).getText();
		if(out.equals(exp)) {
			System.out.println("Success");
			String re="SUCCESS";
			excel_operations op=new excel_operations (); 
			op.write_excl(re, r);
			
			
			
			
		}
		else
		{
			System.out.println("Failure");
			String re="FAILURE";
			excel_operations op=new excel_operations (); 
			op.write_excl(re, r);
			
		}
	}
	public void clickrb(String type) {

		if(type.equals("male")){
			
			
			List rb = dr.findElements(By.name("Gender"));
			((WebElement) rb.get(0)).click();	
			
		}
		else {
			List rb1 = dr.findElements(By.name("Gender"));
		((WebElement) rb1.get(1)).click();
		}
		
	}
	public void click(String  xp) {
		dr.findElement(By.xpath(xp)).click();
	}
	public void launchChrome(String url) {
		System.setProperty("webdriver.chrome.driver","chromedriver_78.exe");
		dr=new ChromeDriver();
		dr.get(url);
	}

	public void close() {
		// TODO Auto-generated method stub
		dr.close();
	}
}
