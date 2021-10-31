package SDAY6;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import SDAY4.login_data;
import SDAY4.login_test;

public class NewTest3 {
	
	login_test lo;
	login_data data_in,data_out;
  @Test
  public void test1() {
	  
	  lo=new login_test();
	  data_in=new login_data();
	  data_out=new login_data();
	  
	  data_in.uid="buenhomber@gmail.com";
	  data_in.pwd="arunpp65@gmail.com";
	  data_in.exp_re1="SUCCESS";
	  
	 data_out=lo.login(data_in);
	 
	 SoftAssert s=new SoftAssert();
	 s.assertEquals(data_out.act_res1,data_in.exp_re1);
	 System.out.println("VALID TEST");
	 
	 System.out.println("ACTUAL RESULT:"+data_out.act_res1);
	  
	  
	  s.assertAll();
	  
	  
  }
  
  
  @Test
  public void test2() {

	  lo=new login_test();
	  data_in=new login_data();
	  data_out=new login_data();
	  
	  data_in.uid="buenhomber@gmail.com";
	  data_in.pwd="arun";
	  data_in.exp_re1="SUCCESS";
	  data_in.exp_em2="The credentials provided are incorrect";
			  data_in.exp_em1="Login was unsuccessful. Please correct the errors and try again.";
	 data_out=lo.login(data_in);
	 SoftAssert s=new SoftAssert();
	 s.assertEquals(data_in.exp_re1,data_out.act_res1);
	 System.out.println("INVALID TEST");
	 
	 System.out.println("ACTUAL RESULT:"+data_out.act_res1+
			 "\n ACTUAL ERRO1:"+data_out.act_em1+
			 "\nACTUAL ER2:"+data_out.act_em2);
	 s.assertAll();
  }

}
