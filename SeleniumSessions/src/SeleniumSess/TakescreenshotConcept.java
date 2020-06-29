package SeleniumSess;

import java.io.File;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakescreenshotConcept {

	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\selenium3\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("https://www.google.com/");
		 
		 //takescreenshot and store in a file format
		 
		 File scr =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 
		 
		// FileUtils.copyFile(src, new File("E:\\selenium3\\google.png"));

		

	}

}
