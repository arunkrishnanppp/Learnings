package DAY8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page {
WebDriver dr;
String xname="//input[@placeholder='Username']";
String xpass="//input[@placeholder='Password']";
String xsubmit="//*[@id=\"login_button_container\"]/div/form/input[3]";
	
public login_page(WebDriver dr) {
	this.dr=dr;
	
}







public void do_login(String string, String string2) {
	System.out.println("in login");
		// TODO Auto-generated method stub
	System.out.println(string);
	
	
	
	//dr.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("shgdfjhsbd");
		dr.findElement(By.xpath(xname)).sendKeys(string);
		dr.findElement(By.xpath(xpass)).sendKeys(string2);
		dr.findElement(By.xpath(xsubmit)).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
