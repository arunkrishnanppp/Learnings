package ASSIGNEMNTS;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class NewTest {
	
	
	

	  user_data input,output;
	  register re;
	  
  @Test(dataProvider = "provide_data")
  public void register(String a,String b,String c,String d,String e,String f) {
	  
	  input.gender=a;
	  input.f_name=b;
	  input.l_name=c;
	  input.email=d;
	  input.pass=e;
	  input.c_pass=f;
	  
	  
	  output=re.reg(input);
	  
	  SoftAssert so=new SoftAssert(); 
	  so.assertEquals(input.email, output.account);
	  System.out.println("EXPECTED RESULT:"+input.email);
	  System.out.println("ACTAUL RESULT:"+output.account);
	  
	 so.assertAll();
	/*  System.out.println("EXPECTED RESULT:"+input.email);
	  System.out.println("ACTAUL RESULT:"+output.account);*/
	  
	  
  }
  /*@AfterMethod
  public void test1() {
	  
	  
	 SoftAssert so=new SoftAssert(); 
	  so.assertEquals(input.email, output.account);
	  System.out.println("EXPECTED RESULT:"+input.email);
	  System.out.println("ACTAUL RESULT:"+output.account);
	  
	 so.assertAll();
  }*/

  @DataProvider(name="provide_data")
  public String[][] provide_data() {
	
	
	  String[][] data= {{"male","averio","cr","jjjsgdhggsjj65@gmail.com","qwertyu","qwertyu"},
				{"female","AVeirooo","crr","jjsdbsjjjj6hhjghg5@gmail.com","qwertyuqwer","qwertyuqwer"}};
	  
	  
	  
	  
	  return data;
   
  }
  @BeforeClass
  public void beforeClass() {
	  input=new user_data();
	  output=new user_data();
	  re=new register();
	  
	  
  }

}
