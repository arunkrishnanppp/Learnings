package assignment3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest extends excel_read {
	
	
	
	
	WebDriver dr;
	homepage hp;
	loginpage lp;
	verifypage cp;
 
	
	
	
	
	@BeforeClass
	public void befor() {
		  System.setProperty("webdriver.chrome.driver","chromedriver_78.exe");
			dr=new ChromeDriver();
		dr.get("http://automationpractice.com/index.php");
	
		hp=new homepage(dr);
		lp=new loginpage(dr);
		cp=new verifypage(dr);
		//testdata=new String[2][3];
		testdata=new String[2][3];
		for(rowno=1;rowno<=2;rowno++) {
			
			
			get_test_data();
		}
		System.out.println(testdata[0][0]);
		;
		
	}
	
	@Test(dataProvider="provider")
	public void test(String a,String b,String c) {
		String uid=a;
		String pass=b;
		String res=c;
		
		hp.click_sign();
		lp.signin(uid,pass);
		String s=cp.verify();
		SoftAssert as=new SoftAssert();
		as.assertEquals(c, s);
		as.assertEquals(s,c);
		cp.signout();
		as.assertAll();
	}
	
	
	@DataProvider(name="provider")
	public String[][] provider() {
		
		
		return testdata;
		
	}
	
}
