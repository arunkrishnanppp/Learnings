package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class jen1 {

	
	@Test
	public void b() {
		SoftAssert as=new SoftAssert();
		
		as.assertEquals("arun", "arun");
		as.assertAll();
	}

}
