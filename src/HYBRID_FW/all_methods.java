package HYBRID_FW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_methods {
	static WebDriver dr;

	public static void launchBrowser(String xpath) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver_78.exe");
		dr=new ChromeDriver();
		//System.out.println(xpath);
		dr.get(xpath);
		
		
	}

	public static void clickLibk(String xpath) {
		
		System.out.println("in click");
		
		
		dr.findElement(By.xpath(xpath)).click();
		// TODO Auto-generated method stub
		
	}

	public static void enetrText(String xpath, String testdata) {
		// TODO Auto-generated method stub
		System.out.println("in enter text");
		System.out.println(testdata);
		
		dr.findElement(By.xpath(xpath)).sendKeys(testdata);
		
	}

	public static void clickButton(String xpath) {
		// TODO Auto-generated method stub
		dr.findElement(By.xpath(xpath)).click();
	
	}

	public static void verify(String xpath, String uid) {
		
		
		if(dr.findElement(By.xpath(xpath)).getText().equals(uid)) {
			System.out.println("login sucessfull");
			
		}
		else
			System.out.println("login not succesfull");
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	

}

