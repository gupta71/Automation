package Testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Basepage;
import Pages.Homepage;
import Pages.Login;

public class Logintest extends Basepage {
	Login lp;
	Homepage hp;
	
	public Logintest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intilization();
		 lp=new Login();
		
	}
	
	@Test(priority=1)
	public void loginpagetitletest() {
	String page=	lp.validateloginpagetitle();
	Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support",page+".");
	}
	
	@Test(priority=2)
	public void crmlogoimage() {
		boolean flag=lp.crmlogoimage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void logintest() {
		hp=lp.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
