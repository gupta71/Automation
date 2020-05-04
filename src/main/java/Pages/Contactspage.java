package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Basepage;

public class Contactspage  extends Basepage {
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactlabel;
	
	@FindBy(xpath="//table/tbody/tr[6]/td/input[@value='52740060']")
	WebElement clickoncontact;
	
	public Contactspage() {
		PageFactory.initElements(driver,this);
	}
	
	public boolean varifycontacspage() {
	return	contactlabel.isDisplayed();
	}
	
	public Contactspage selectcontacts() {
		 clickoncontact.click();
		 return new Contactspage();
	}

	}
	
	
	
	
	
	
