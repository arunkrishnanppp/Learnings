package DAY8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class home_page {

	
	WebDriver dr;
	
	String base_xp="//div[@class='inventory_item'][";
	
	
	
	public home_page(WebDriver dr) {
		this.dr=dr;
		
	}
	
	
	
	
	public String add_to_cart(int i) {
		// TODO Auto-generated method stub
	
		
		String new_xp=base_xp+i+"]//button";
		
		dr.findElement(By.xpath(new_xp)).click();
		
		String name=dr.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		
		return name;
	}




	public void click_car() {
		// TODO Auto-generated method stub
		
dr.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();



	}

}
