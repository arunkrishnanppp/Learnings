package SDAY6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Return;

public class NewTest4 {
  @Test(dataProvider="security")
  public void login(String u,String p) {
	  System.out.println("LOGIN:"+u+" "+p);
	  
  }
  
  
  @DataProvider(name="security")
  public String [][] getdata(){
	  String [][]data= {{"uid1","ow1"},{"uid2","pwd2"}};
	  return data;
  }
 
  
}
