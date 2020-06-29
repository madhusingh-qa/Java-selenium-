package SeleniumSess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		 
      System.setProperty("webdriver.gecko.driver", "E:\\selenium3\\geckodriver.exe");
      
    //System.setProperty("webdriver.gecko.driver", "E:\\selenium3\\geckodriver.exe");
          
       WebDriver driver = new FirefoxDriver();
       
        driver.get("https://www.ebay.com/");
       // driver.findElement(By.linkText("register")).click();
       
       
		
		

	}

}
