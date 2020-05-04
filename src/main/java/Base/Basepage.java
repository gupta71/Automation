package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import util.Testutil;

public class Basepage {
	public static WebDriver driver;
	public static Properties prop;

	
public Basepage() {
	try {
	prop=new Properties();
	FileInputStream ip=new FileInputStream("C:\\Users\\cute puja\\eclipse-workspace\\Freecrm"
			+"\\src\\main\\java\\config\\config.properties");
	
		prop.load(ip);
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	public void intilization() {
	String browser=	prop.getProperty("browser");
	if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		 driver=new ChromeDriver();
	}
	else if(browser.equals("ff")){
		System.setProperty("WebDriver.firefox.driver", "E://chromedriver.exe");
		driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//driver.manage().timeouts().pageLoadTimeout(Testutil.Page_load_Timeout, TimeUnit.SECONDS);
	//driver.manage().timeouts().implicitlyWait(Testutil.IMPLICT_WAIT, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
		
		
		
	}
	



	
}

