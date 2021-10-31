package ASSIGNMENT2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

public class NewTest extends basic_test_login{

	@BeforeClass
	public void conffg() {
		
		testdata=new String[2][3];
		for(rowno=1;rowno<=2;rowno++) {
			
			get_test_data();
			
			
		}
		
		
		
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=2;j++)
			{
				System.out.print(testdata[i][j]+"    ");
			}System.out.println();
		}
		
		
		rowno=0;
	
	}
	
	
@Test(dataProvider="provider")
public void login_test(String uid,String pass,String act) {
	String a_res;
	System.out.println("UID:"+uid);
	System.out.println("PWD:"+pass);
	
	a_res=login();
	
	
	SoftAssert as=new SoftAssert();
	as.assertEquals(act,a_res);
	as.assertAll();
	rowno++;
	
}
	
	@DataProvider(name="provider")
	public String[][] provider() {
		
		
		return testdata;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
