package DAY8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
	
	login_page lp;
	home_page hp;
	cart c;
	WebDriver dr;
	String a,b;
	
	
	@BeforeClass
	public void bc() {
		System.setProperty("webdriver.chrome.driver","chromedriver_78.exe");
		dr=new ChromeDriver();
		dr.get("http://www.saucedemo.com/");
		lp=new login_page(dr);
		hp=new home_page(dr);
		
		
		c=new cart(dr);
		
	}
	
  @Test
  public void f() {
  lp.do_login("standard_user","secret_sauce");
  a=hp.add_to_cart(1);
 hp.click_car();
 b=c.verify();
   a="dhdjfhdj";
  SoftAssert as=new SoftAssert();
  as.assertEquals(a,b);
  as.assertAll();
  }
}
