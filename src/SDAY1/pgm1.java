package SDAY1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","chromedriver_78.exe");
WebDriver dr=new ChromeDriver();
dr.get("https://www.facebook.com");
dr.findElement(By.id("email")).sendKeys("abc@gmail.com");
dr.findElement(By.id("pass")).sendKeys("abcdef");	
		
		
		
		
		
		
		
		
		
	}

}
