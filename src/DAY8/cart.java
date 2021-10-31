package DAY8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cart {
	
	
	WebDriver dr;
	public cart(WebDriver dr) {
		this.dr=dr;
	}

	public String verify() {
String name2=dr.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		
		return name2;
	}

}
