package SDAY2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver_78.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com");
	/*	dr.findElement(By.name("email")).sendKeys("ashikmoosa96@gmail.com");
		dr.findElement(By.name("pass")).sendKeys("NoNames3#");
		dr.findElement(By.id("loginbutton")).click();*/
		
		
		
		WebElement we1=dr.findElement(By.id("day"));
		Select sel1=new Select(we1);
		sel1.selectByVisibleText("17");
		
		
		
		
		
		WebElement we2=dr.findElement(By.id("month"));
//		/WebElement we2=dr.findElement(By.xpath("//*[@id=\"month\"]"));
		Select sel2=new Select(we2);
		sel2.selectByVisibleText("Jun");
		
		
		WebElement we3=dr.findElement(By.id("year"));
		Select sel3=new Select(we3);
		sel3.selectByVisibleText("1998");
		
		

		
		
		
		//to get tile of page
		
		
		/*
		
		String title=dr.getTitle();
		
		System.out.println(title);*/
		
		
		
		//radio button
		/*
		List rb=dr.findElements(By.name("sex"));
		((WebElement)rb.get(1)).click();
		
		*/
		
		
		String a_profilename=dr.findElement(By.className("_1vp5")).getText();
	//	System.out.println(a_profilename);
		String e_profilename="Frank";
		
		System.out.println(a_profilename.equals(e_profilename));
		if(a_profilename.equals(e_profilename)) {
			System.out.println("correct");
		}
		else
			System.out.println("incorrrect");
		
	}

}
