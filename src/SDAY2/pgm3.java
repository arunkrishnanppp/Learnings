package SDAY2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String link="https://www.w3schools.com/html/html_tables.asp";
		System.setProperty("webdriver.chrome.driver","chromedriver_78.exe");
		WebDriver dr=new ChromeDriver();
		dr.get(link);
		
		//*[@id="customers"]/tbody/tr[1]/th[3]
		
		
		String one=dr.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/th[3]")).getText();
		
		
		
		System.out.println(one);
		
		
		
		
		
		String two=dr.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[5]/td[1]")).getText();
		
		
		System.out.println(two);
		
		
		int r=5,c=3;
		String three=dr.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+ r +"]/td["+ c +"]")).getText();
System.out.println(three);		
		
	}

}
