package testpoc;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class reg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		

		System.setProperty("webdriver.chrome.driver","chromedriver_78.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("http://automationpractice.com");
		System.out.println(dr.getWindowHandle());
		String sign="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a";
		dr.findElement(By.xpath(sign)).click();
		
		
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		/*ArrayList<String> list=new ArrayList<String>(dr.getWindowHandles());
		for(String aut:list) {
			System.out.println(aut);
		}*/
		/*WebDriverWait wt=new WebDriverWait(dr,8);
		wt.until(ExpectedConditions.visibilityOf(dr.findElement(By.id("email_create"))));
		*/
		
		
		
		
		WebDriverWait wait=new WebDriverWait(dr,6);
		 
		 
		 
		// Wait till the element is not visible
		 
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='create-account_form']/div/div[2]/input")));
		
		
		String email="//div[@class='col-xs-12 col-sm-6'][1]//child::div[@class='form-group form-error']//child::input[@id='email_create']";
		/*WebDriverWait wt=new WebDriverWait(dr,8);
		wt.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath(email))));*/
		//dr.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("sdfsdfg");
		//dr.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("dfsfdf");
		//dr.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("gjgjsdhu@gmail.com");
	//dr.findElement(By.name("email_create")).sendKeys("dshfkhsdf");
		
		//div[contains(@class,'form-error')]/input
	//dr.findElement(By.xpath("//input[@id='email_create']")).sendKeys("dfdnfbhbsdbh");
//	dr.findElement(By.xpath("//input[@id='email_create']")).sendKeys("dfnhsdhf");
		//dr.findElement(By.xpath(email)).sendKeys("asfsffsafasfas");
		/*dr.findElement(By.xpath("//form[@id='create-account_form']/div/div[2]/input")).click();
		
		dr.findElement(By.cssSelector("#email_create")).sendKeys("dssbhfjdhg");
		
		*/
		
		
		
	//	dr.findElement(By.id("email_create")).click();
		
		
		
		dr.findElement(By.xpath("//form[@id='create-account_form']/div/div[2]/input")).sendKeys("hhhhhsdhasghhd@gmail.com");
		String create="//*[@id=\"SubmitCreate\"]/span";
		dr.findElement(By.xpath(create)).click();
		
		//dr.findElement(By.id("id_gender1")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("id_gender")));
		ArrayList<WebElement> list=(ArrayList<WebElement>) dr.findElements(By.name("id_gender"));
		for(WebElement out:list) {
			System.out.println(out);
		}
		list.get(0).click();
/*		dr.close();*/
		
		
		
		//id_state
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_state")));
		//dr.findElement(By.id("id_state")).click();
		Select drops=new Select(dr.findElement(By.id("id_state")));
		drops.selectByVisibleText("Alaska");
		
		/*ArrayList<WebElement> list1=(ArrayList<WebElement>) dr.findElements(By.id("id_state"));
		for(WebElement out:list1) {
			System.out.println(out);
		}
		list1.get(3).click();*/
		
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
