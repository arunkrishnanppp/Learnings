package SDAY4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm1 {
	
	public  static void main(String args[]) {
		// TODO Auto-generated method stub
				String link="https://www.naukri.com/";
				System.setProperty("webdriver.chrome.driver","chromedriver_78.exe");
				WebDriver dr=new ChromeDriver();
				dr.get(link);
				//String hnd=dr.getWindowHandle();
				for(String handle:dr.getWindowHandles()) {
					dr.switchTo().window(handle);
					String title=dr.getTitle();
					System.out.println(title);
				}
		
		
		
		
	}

}
