package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver dr;
/*	
	@FindBy(xpath="//*[@id=\"email\"]");
	WebElement email;
*/
static By xpath=By.xpath("//*[@id='email']");
static By xpath2=By.xpath("//*[@id=\"passwd\"]");
	static By xpath3=By.xpath("//*[@id=\"SubmitLogin\"]/span");
	public loginpage(WebDriver dr) {
		// TODO Auto-generated constructor stub
		this.dr=dr;
		 PageFactory.initElements(dr, this);
	}

	public void signin(String uid, String pass) {
		// TODO Auto-generated method stub
		dr.findElement(xpath).sendKeys(uid);
		dr.findElement(xpath2).sendKeys(pass);
		dr.findElement(xpath3).click();
		
	}

}
