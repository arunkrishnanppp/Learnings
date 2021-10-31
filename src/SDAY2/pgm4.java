package SDAY2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String link="https://www.w3schools.com/html/html_tables.asp";
		System.setProperty("webdriver.chrome.driver","chromedriver_78.exe");
		WebDriver dr=new ChromeDriver();
		dr.get(link);
		
		 /*System.out.printf("%1s %15s %16s", "Company", "contact", "country");
			System.out.println();*/
		
		for(int r=2;r<=7;r++) {
			for(int c=1;c<=3;c++) {
				
				
				String data="//*[@id=\"customers\"]/tbody/tr["+ r +"]/td["+ c +"]";
				String s=dr.findElement(By.xpath(data)).getText();
				System.out.print(s+" ");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
