package SeleniumSess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleWindowPopup {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "E:\\selenium3\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    
    
    

		
		
		
		

	}

}
