package SeleniumSess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\selenium3\\geckodriver.exe");
		
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		 
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 driver.get("https://www.google.com/");
		 
		 driver.navigate().to("https://www.amazon.in/");
		 
		 //back and forward button simulation
		 
		 driver.navigate().back();
		 
		 Thread.sleep(3000);
		 
		 driver.navigate().forward();
		 
		 Thread.sleep(3000);
		 
		 driver.navigate().back();
		 
		 driver.navigate().refresh();
			
		

	}

}
