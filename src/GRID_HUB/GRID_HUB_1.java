package GRID_HUB;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GRID_HUB_1 {
WebDriver dr;
String autURL,nodeURL;
/*@BeforeClass
public void setup() throws MalformedURLException
{
autURL="https://www.facebook.com";
nodeURL="http://172.16.29.233:5566/wd/hub";
DesiredCapabilities cap=DesiredCapabilities.firefox();
cap.setBrowserName("firefox");
cap.setPlatform(Platform.WINDOWS);
dr=new RemoteWebDriver(new URL(nodeURL),cap);

}*/
@Test
public void t1() throws MalformedURLException {
	
	autURL="https://www.facebook.com";
	nodeURL="http://172.16.29.206:5567/wd/hub";
	DesiredCapabilities cap=DesiredCapabilities.firefox();
	cap.setBrowserName("firefox");
	cap.setPlatform(Platform.WINDOWS);
	dr=new RemoteWebDriver(new URL(nodeURL),cap);
	dr.get("https://www.facebook.com");
	dr.findElement(By.id("email")).sendKeys("haiii");
}



@Test 
public void t2() throws MalformedURLException {
	
	
	autURL="https://www.facebook.com";
	nodeURL="http://172.16.29.222:5566/wd/hub";
	DesiredCapabilities cap=DesiredCapabilities.chrome();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	dr=new RemoteWebDriver(new URL(nodeURL),cap);
	dr.get("https://www.facebook.com");
	dr.findElement(By.id("email")).sendKeys("haiii");
}

}
//java -Dwebdriver.chrome.driver="chromedriver_78.exe" -jar sss.jar -role webdriver -hub http://172.16.29.222:4455/grif/register/ -port 5566  