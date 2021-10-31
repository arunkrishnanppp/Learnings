package SDAY4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String link="http://demo.guru99.com/test/delete_customer.php";
		System.setProperty("webdriver.chrome.driver","chromedriver_78.exe");
		WebDriver dr=new ChromeDriver();
		dr.get(link);
		
		
		
		dr.findElement(By.name("cusid")).sendKeys("3333");
		dr.findElement(By.name("submit")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert a=dr.switchTo().alert();
		String s=a.getText();
		System.out.println(s);
		a.dismiss();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert a1=dr.switchTo().alert();
		String s1=a.getText();
		a1.accept();
		System.out.println(s1);
		
	}

}
