package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Basepage;

public class Homepage extends Basepage{
	
	@FindBy(xpath="//td[contains(text(),'Demo User')]")
	WebElement userlabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactlink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newcontactlink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealslink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement taskslink;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	//action on this object;
	
	public String varifypagetitle() {
	return driver.getTitle();
	}
	
	public Contactspage clickoncontactslink() {
		contactlink.click();
		return new Contactspage();
	}
	
	public  boolean variuser() {
		return userlabel.isDisplayed();
		
	}
	
	public Dealspage clickondealslink() {
		dealslink.click();
		return new Dealspage();
	}
	
	public taskspage clickontaskslink() {
		taskslink.click();
		return new taskspage();
	}
	public void clickonnewcontactlink() {
		Actions action=new Actions(driver);
		action.moveToElement(contactlink).build().perform();
		newcontactlink.click();
		
	}
	

	
	}


