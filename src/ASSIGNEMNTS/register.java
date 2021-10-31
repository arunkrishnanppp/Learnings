package ASSIGNEMNTS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class register {

	
	public user_data reg(user_data u)
	{
		user_data out=new user_data();
		String link="http://demowebshop.tricentis.com/";
		System.setProperty("webdriver.chrome.driver","chromedriver_78.exe");
		WebDriver dr=new ChromeDriver();
		dr.get(link);
		dr.findElement(By.className("ico-register")).click();
	
		if(u.gender.equals("male")){
			
			
			List rb = dr.findElements(By.name("Gender"));
			((WebElement) rb.get(0)).click();	
			
		}
		else {
			List rb1 = dr.findElements(By.name("Gender"));
		((WebElement) rb1.get(1)).click();
		}
		
		
		//Registering auto
		dr.findElement(By.id("FirstName")).sendKeys(u.f_name);
		dr.findElement(By.id("LastName")).sendKeys(u.l_name);
		dr.findElement(By.id("Email")).sendKeys(u.email);
		dr.findElement(By.id("Password")).sendKeys(u.c_pass);
		dr.findElement(By.id("ConfirmPassword")).sendKeys(u.pass);
		dr.findElement(By.id("register-button")).click();
		
		
		out.account=dr.findElement(By.className("account")).getText();
	
		
		
		return out;
		
	}
	
	
	
	
	
	
}
