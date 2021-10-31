package SDAY5;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest4 {

	
	
	@BeforeClass
	public void bef() {
		System.out.println("i cme to the cricket stadium");
	}
	@AfterClass
	public void af() {
		System.out.println("Now i am home");
	}
	
	@BeforeMethod
	public  void hello() {
		System.out.println("Hello");
	}
	@AfterMethod
public void bye() {
		System.out.println("Bye");
	}
	
	@Test
	public void a() {
		System.out.println("I meet Mr Dhoni");
	}
	@Test
	public void b() {
		System.out.println("I had lounch with kohli");
	}
	
	@Test
	public void c() {
		System.out.println("I took photo with Rohit sharma");
	}
		
	
}
