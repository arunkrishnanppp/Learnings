package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class verifypage {
	WebDriver dr;
	//*[@id="header"]/div[2]/div/div/nav/div[1]/a/span
@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")
WebElement name;
//	@FindBy(xpath="<div class=\"header_user_info\">\r\n" + 
//			"			<a class=\"logout\" href=\"http://automationpractice.com/index.php?mylogout=\" rel=\"nofollow\" title=\"Log me out\">\r\n" + 
//			"			Sign out\r\n" + 
//			"		</a>\r\n" + 
//			"	</div>")
//	WebElement xpath;
static By xpath=By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span");
static By  xpath2=By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a");
	public verifypage(WebDriver dr) {
		// TODO Auto-generated constructor stub
	this.dr=dr;
	PageFactory.initElements(dr,this);
	
	}
	

	public String verify() {
		// TODO Auto-generated method stub
		
		
		return name.getText();
	//return dr.findElement(xpath).getText();
	}


	public void signout() {
		// TODO Auto-generated method stub
		dr.findElement(xpath2).click();
	}

}
