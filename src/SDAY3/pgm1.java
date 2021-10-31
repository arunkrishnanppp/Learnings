package SDAY3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//login_data ld = new login_data();
		String link="http://demowebshop.tricentis.com/";
		System.setProperty("webdriver.chrome.driver","chromedriver_78.exe");
		WebDriver dr=new ChromeDriver();
		//dr.get(link);
		dr.navigate().to(link);
		String title=dr.getTitle();
		
		String og="Demo Web Shop";
		if(title.equals(og))
			System.out.println("VERIFIED");
		else
			System.out.println("FAILED");
		
		
		
		dr.findElement(By.className("ico-register")).click();
		String title1=dr.getTitle();
		String og1="Demo Web Shop. Register";
		if(title1.equals(og1))
			System.out.println("VERIFIED");
		else
			System.out.println("FAILED");
		
		//choosing radio button
		List rb = dr.findElements(By.name("Gender"));
		((WebElement) rb.get(0)).click();
		
		//Registering auto
		dr.findElement(By.id("FirstName")).sendKeys("Aveiro");
		dr.findElement(By.id("LastName")).sendKeys("CR");
		dr.findElement(By.id("Email")).sendKeys("kkkkkkkarun@gmail.com");
		dr.findElement(By.id("Password")).sendKeys("123456789");
		dr.findElement(By.id("ConfirmPassword")).sendKeys("123456789");
		dr.findElement(By.id("register-button")).click();
		
		//validation-summary-errors
		
		
	/*	String error=dr.findElement(By.className("validation-summary-errors")).getText();
		if(error.equals("The specified email already exists"))
			System.out.println("The specified email already exists. Change email");
		else
			System.out.println("OK");*/
		
		String s1="Your registration completed";
		String s=dr.findElement(By.className("result")).getText();
		if(s1.equals(s))
			System.out.println("registation complete verified");
		else
			System.out.println("failed");
		
		
		
		String email="kkkkkkkaru@gmail.com";
		String email1=dr.findElement(By.className("account")).getText();
		
		
		if(email.equals(email1))
			System.out.println("emeil verified");
		else
			System.out.println("email not verified");
		
		/*
		try {
			dr.wait(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		dr.findElement(By.className("ico-logout")).click();
		//dr.navigate().to("http://www.facebook.com");
		//dr.get("http://www.facebook.com");
		//dr.close();
	}
}
