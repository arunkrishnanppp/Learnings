package assignment3;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

WebDriver dr;
	
static By xpath=By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	public homepage(WebDriver dr) {
		// TODO Auto-generated constructor stub
		this.dr=dr;
		 PageFactory.initElements(dr, this);
		 
	}

	public void click_sign() {
		// TODO Auto-generated method stub
		//dr.findElement(By.className("login")).click();
	//ignbtn.click();
//	
//dr.findElement(xpath).click();

dr.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
	}

}
