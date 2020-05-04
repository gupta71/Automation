package Testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Basepage;
import Pages.Contactspage;
import Pages.Homepage;
import Pages.Login;
import util.Testutil;

public class Hometest extends Basepage {
	Login lp;
	Homepage hp;
	public Testutil tu;
	Contactspage cp;

	public Hometest() {
		super();
	}
//test casees should be seperted from each other=independent with each other;
	//before each test case launch the browser;
	//@test=excute test case
	////after each test case close the browser
	@BeforeMethod
	public void setup()  {
		intilization();
		tu = new Testutil();
		lp = new Login();
		hp=new Homepage();
		hp = lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority=1)
	public void titlecheck() {
		String title = hp.varifypagetitle();
		
		Assert.assertEquals(title, "CRMPRO", "homepage title not mathche");
		
	}

	@Test(priority=2)
	public void verifyuser() {
		tu.switchframe();
		Assert.assertTrue(hp.variuser());
	}
	
	@Test(priority=3)
	public void varifycontactlinktest() {
		tu.switchframe();
	cp=	hp.clickoncontactslink();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}