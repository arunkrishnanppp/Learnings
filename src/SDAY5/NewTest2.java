package SDAY5;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void a() {
	  System.out.println("IN TEST A");
  }
  @BeforeTest
  public void B() {
	  System.out.println("B");

  }
  @AfterTest
  public void A() {
	  System.out.println("A");
  }
  @Test
  public void b() {
	  System.out.println("IN TEST B");
  }
  
  
}
