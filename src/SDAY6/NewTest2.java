package SDAY6;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest2 {
  @Test
  public void a() {
	  
	  String s1="noida",s2="noida";
	  Assert.assertEquals(s1, s2);

	  System.out.println("TEST A PASS AND IN TEST A");
	  
  }
  
  
  
  @Test 
  public void b() {
	  
	  String s1="noida",s2="Noida";
	  Assert.assertEquals(s1, s2);
	  System.out.println("IN TEST b");
	  
  
  }
  
  
  @Test 
  public void c() {
	  String s1="gnoida",s2="noida";
	  SoftAssert s=new SoftAssert();
	  s.assertEquals(s1, s2);
	  System.out.println("IN TEST C");
	  s.assertAll();
  }
}
