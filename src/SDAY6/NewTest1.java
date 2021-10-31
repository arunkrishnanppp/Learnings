package SDAY6;

import org.testng.annotations.Test;

public class NewTest1 {
  @Test(priority=0)
  public void testz() {
	  System.out.println("IN TEST WITH P 0");
  }
  @Test(priority=2)
  public void testsfsdfz() {
	  System.out.println("IN TEST WITH P 2");
  }
  
  @Test(priority=1)
  public void testdfdsz() {
	  System.out.println("IN TEST WITH P 1");
  }
  
}
