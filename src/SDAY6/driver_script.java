package SDAY6;
import org.openqa.selenium.WebDriver;

public class driver_script {

public static void main(String[] args) {
String kw,loc,td;
WebDriver dr=null;
all_webelement_fns1 we=new all_webelement_fns1 ();
excel_operations excel=new excel_operations();
for(int r=1;r<=4;r++) {
kw= excel.read_excel(r,1);
loc=excel.read_excel(r,2);
td=excel.read_excel(r,3);
switch(kw)
{	
case "launchchrome":
we.launchChrome(td);
break;

case "enter_txt" :
we.enter_text(loc,td);
break;

case "click_btn" :
we.click(loc);
break;
}
}
}

}