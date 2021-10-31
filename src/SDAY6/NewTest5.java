package SDAY6;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest5 {
 login_data data_in,data_out;
 basic_login lo;
 
 
 @BeforeClass
 public void befor() {
	lo=new basic_login();
	data_out=new login_data();
	data_in=new login_data();
 }

 
 @Test(dataProvider="security")
 public void login_testing(String a,String b,String c) {
	 
	 data_in.uid=a;
	 data_in.pwd=b;
	 data_in.exp_re1=c;
	 data_out=lo.login(data_in);
	 SoftAssert sa=new SoftAssert();
	 sa.assertEquals(data_out.exp_re1,data_out.act_res1);
	 sa.assertAll();
	 
 }
	
@DataProvider(name="security")
public String[][] getdata(){
	String[][] data= {{"buenhomber@gmail.com","arunpp65@gmail.com","SUCCESS"},
			{"beunhomber@gmail.com","arunpp@gmail.com","FAILURE"}};
	

return data;
}

}
	
	
	
	

