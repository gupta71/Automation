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

public class Contacstest extends Basepage{
	Login lp;
	Homepage hp;
	public Testutil tu;
	Contactspage cp;
	
	public Contacstest() {
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException {
		intilization();
		tu = new Testutil();
		lp = new Login();
		hp=new Homepage();
		hp = lp.login(prop.getProperty("username"), prop.getProperty("password"));
		tu.switchframe();
		cp=hp.clickoncontactslink();
	}
	@Test(priority=1)
	public void verifycontactslabel() {
	Assert.assertTrue(	cp.varifycontacspage(),"contacts label is missing on the page");
	}
	
	@Test(priority=2)
	public void selectcontactstest() {
		cp.selectcontacts();
		
	}
		@AfterMethod
		public void teardown() {
			//driver.quit();
		}
	
	
	

}
