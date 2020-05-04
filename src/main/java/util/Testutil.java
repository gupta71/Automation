package util;

import Base.Basepage;

public class Testutil extends Basepage{
	
	public static long Page_load_Timeout=20;
	public  static long IMPLICT_WAIT=10;

	public void switchframe() {
		driver.switchTo().frame("mainpanel");
	}

	

	
}
