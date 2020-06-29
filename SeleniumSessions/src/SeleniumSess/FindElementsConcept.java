package SeleniumSess;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\selenium3\\geckodriver.exe");
		
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		 
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 driver.get("https://www.ebay.com/");
		
		 // count total no. of links on the page
		 // text of the all links
		 
	      List <WebElement> linkList = driver.findElements(By.tagName("a"));
	  
	      System.out.println(linkList.size()); 
	      
	      for(int i=0;i<linkList.size();i++) {
	    	  
	    	 String text = linkList.get(i).getText();
	    	  
	    	  System.out.println(text);
	    	  
	      }
	    
	    
	   
	
	

	}

}
