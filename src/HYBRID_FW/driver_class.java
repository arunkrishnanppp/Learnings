package HYBRID_FW;

public class driver_class extends excel_read {

	
	public static void main(String args[]) {
		keyword_sh ksh=new keyword_sh();
		tc_selection tcs=new  tc_selection();
		
		
		int i,j,k;
		String testdata=null;
		
		for(i=1;i<=3;i++) {
			
			tcs=read_sheet(i);
			//System.out.println(tcs.flag);
			
			if(tcs.flag.equals("Y")) {
				
				
						for(j=1;j<10;j++) {
							
							
							ksh=read_keyword_sh(j);
							//System.out.println(ksh.TC_ID);
							
							
							if(tcs.tcid.equals(ksh.TC_ID)) {
								
								
								
								System.out.println("found");
								break;
							}
							
							else
							{
								continue;
								
								
							}
						}
						
						
						get_test_data(tcs.test_data_sh);
				
						for(login_test_data data:list) {
							//System.out.println(t.uid);
						
						
							for(k=j;k<=(j+tcs.no_steps-1);k++) {
									if(k==(j+2)) {
										testdata=data.uid;}
									if(k==(j+3)) {
										testdata=data.pwd;}
								
									System.out.println(testdata);
								ksh=read_keyword_sh(k);
								String ch=ksh.KeyWord;
								/*System.out.println("testdata:"+testdata);
								System.out.println(ksh.TC_ID);*/
								System.out.println(ksh.KeyWord);
								System.out.println(ksh.Xpath);
								switch(ch) {
								case "launch browser":all_methods.launchBrowser(ksh.Xpath);
								break;
								case "clickLink":all_methods.clickLibk(ksh.Xpath);
								
								break;
								case "enterText":all_methods.enetrText(ksh.Xpath,testdata);
								break;
								case"clickButton":all_methods.clickButton(ksh.Xpath);
								break;
								case "verify":all_methods.verify(ksh.Xpath,data.uid);
								break;
								
								
								
								
								}
								
							}
							
							if(k==(j+tcs.no_steps))
							{
								System.out.println("pass");
								write_tc(i,"pass");
								
							}
							else
							{
								System.out.println("fail");
								write_tc(i,"fail");
							}
						
						
						
						
						}
				
				
				
			}
			
			
		}
		
		
		
		
		
	}

	
	
		
}
