package SDAY7;

import org.openqa.selenium.WebDriver;

public class driver_script {

	public static void main(String[] args) {
		String kw,loc,td;
		WebDriver dr=null;
		all_webelement_fns1 we=new all_webelement_fns1(dr);
		excel_operations excel=new excel_operations();
		for(int r=1;r<=19;r++) {
			kw= excel.read_excel(r,3);
			loc=excel.read_excel(r,4);
			td=excel.read_excel(r,5);
			
			System.out.println(kw);
			System.out.println(loc);
			System.out.println(td);
			
			
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
				we.close();break;
			}
		}
	}

}
