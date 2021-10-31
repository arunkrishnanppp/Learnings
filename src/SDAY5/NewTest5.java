package SDAY5;

import java.util.ArrayList;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import SDAY4.excel_io_al;
import SDAY4.login_data;
import SDAY4.login_test;

public class NewTest5 {
	login_test lo;
	login_data data_in,data_out;
	excel_io_al object;
	ArrayList<login_data> list;
	int i=1;
	@BeforeClass
	public void read() {
		list=new ArrayList<login_data>();
		object =new excel_io_al();
		list=object.get_test_data();
		
		
		
		for(login_data l:list) {
			System.out.println(l.uid+"      "+l.pwd);
		}
		
		}
	@Test
	public void t1() {
		

		  lo=new login_test();
		  data_in=list.get(0);
		  data_out=new login_data();
		 
		 data_out=lo.login(data_in);
		 
		 System.out.println("ACTUAL RESULT:"+data_out.act_res1+
				 "\n ACTUAL ERRO1:"+data_out.act_em1+
				 "\nACTUAL ER2:"+data_out.act_em2);
		
	}
	@Test
	public void t2() {
		

		  lo=new login_test();
		  data_in=list.get(1);
		  data_out=new login_data();
		 
		 data_out=lo.login(data_in);
		 
		 System.out.println("ACTUAL RESULT:"+data_out.act_res1+
				 "\n ACTUAL ERRO1:"+data_out.act_em1+
				 "\nACTUAL ER2:"+data_out.act_em2);
		 System.out.println("TEST RE:"+data_out.test_res);
		 System.out.println(i);
		
	}
	
	
	
	
	@AfterMethod
	public void af() {
		object =new excel_io_al();
		object.write_excel(i, data_out);
		
		i++;
	}
	
	
	
	
	
	
	
	
	
}
