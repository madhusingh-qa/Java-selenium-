package SeleniumSess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		// 1 ff browser
		// gecodriver
		
				
		System.setProperty("webdriver.gecko.driver", "E:\\selenium3\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver","E:\\selenium3\\chromedriver.exe");
		  
		    WebDriver driver = new FirefoxDriver ();
		   // WebDriver driver = new ChromeDriver();
		    
		       driver.get("http://www.google.com");
		  
		      String title = driver.getTitle();
		      System.out.println(title);
		      
		      if(title.equals("Google")) {
		    	  System.out.println("correct");
		    		     
		      }
		      else {
		    	System.out.println("incorrect");
		      }
		      
		       String url = driver.getCurrentUrl();
		       System.out.println(url);
		       driver.quit();
	}
	

}