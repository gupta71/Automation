  package Pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Basepage;

public class Login extends Basepage {
	
	

	//creating page factory eg.driver.find element (By.locatorname("name"))like this we r doing down there also
	@FindBy(name="username")
	WebElement unme;
	
	@FindBy(name="password")
	WebElement puswd;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement login;
	
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement signup;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')][1]")
	WebElement crmlogo;
	
	//all this varible or object are intilized through pagefactory .initElements,by using this we r intilizing current class o
	//object eg.. crmlogo,signup,etc
	public Login() {
		PageFactory.initElements(driver,this);
	}
	
	//we r doing action on this webelement using sendkeys or any other keys
	public String validateloginpagetitle() {
		return driver.getTitle();
	}
	public boolean crmlogoimage() {
		return crmlogo.isDisplayed();
	}
	
	public Homepage login(String uname, String pword) {//(String un,String pw) {
		unme.sendKeys(uname);//username.sendkeys(un)
		puswd.sendKeys(pword);//username.sendkeys(pw)
		login.click();
		return new  Homepage();
	}
}
