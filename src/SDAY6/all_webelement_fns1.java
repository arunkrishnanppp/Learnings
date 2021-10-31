package SDAY6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_webelement_fns1 {

	
	WebDriver dr;
	
	/*public all_webelement_fns1(WebDriver dr2) {
		this.dr=dr;// TODO Auto-generated constructor stub
	}*/
	
	public void enter_text(String xp,String data) {
		dr.findElement(By.xpath(xp)).sendKeys(data);
	}
	public void click(String  xp) {
		dr.findElement(By.xpath(xp)).click();
	}
	public void launchChrome(String url) {
		System.setProperty("webdriver.chrome.driver","chromedriver_78.exe");
		dr=new ChromeDriver();
		dr.get(url);
	}
}
