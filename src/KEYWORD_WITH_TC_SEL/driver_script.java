package KEYWORD_WITH_TC_SEL;

import org.openqa.selenium.WebDriver;

public class driver_script extends excel_operations {
	 
	public static void main(String[] args) {
		String kw,loc,td;
		WebDriver dr=null;
		all_webelement_fns1 we=new all_webelement_fns1(dr);
		excel_operations excel=new excel_operations();
		//tc_selection tcs=new tc_selection();
		
		tc tcs=new tc();
		key ksh=new key();
		
		int i,j,r;
		String testdata=null;
		
		for(i=1;i<=3;i++) {
			
			tcs=read_sheet(i);
			
		
			if(tcs.flag.equals("Y")) {
				System.out.println("yes");
				for(j=1;j<19;j++) {
					
					ksh=read_keyword_data(j);
					/*System.out.println(tcs.tcid);
					System.out.println(ksh.TC_ID);*/
					
					if(ksh.TC_ID.equals(tcs.tcid)){
					
						System.out.println("found");
						break;
						
						
					}
					else
						continue;
					
					
					
					
					
				}
				System.out.println(tcs.tcid);
				
				System.out.println(j);
				for( r=j;r<=(j+tcs.no_steps-1);r++) {
					kw= excel.read_excel(r,3);
					loc=excel.read_excel(r,4);
					td=excel.read_excel(r,5);
					
					System.out.println(kw);/*
					System.out.println(kw);
					System.out.println(loc);
					System.out.println(loc);
					System.out.println(td);
					System.out.println(td);*/
					
					switch(kw)
					{
					case "launchchrome":
						we.launchChrome(td);
						break;
						
					case "enter_txt" :
						we.enter_txt(loc,td);
						break;
					
					case "click_btn" :
						we.click(loc);
						break;
						
					case "click_link":
						we.clicklink(loc);
						break;
					case "click_rb":
						we.clickrb(td);
						break;
					case "Verify":
						we.verify(loc,td,r); break;
					case "closechrom":
						System.out.println("clossee");
						we.close();break;
					}
				}
				System.out.println("**********");
				System.out.println(r);
				System.out.println(j+tcs.no_steps);
				System.out.println("*******");
				if(r==(j+tcs.no_steps))
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
