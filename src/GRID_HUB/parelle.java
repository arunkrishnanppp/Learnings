package GRID_HUB;

import org.testng.annotations.Test;

public class parelle {
 
	
	
	
	@Test
	public void t1() {
		System.out.println("in test t1 - start");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("in test 1 -stop");
	}
	
	

	@Test
	public void t2() {
		System.out.println("in test t2 - start");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("in test 2 -stop");
	}
}
