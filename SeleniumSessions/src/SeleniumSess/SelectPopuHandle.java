package SeleniumSess;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectPopuHandle {

	public static void main(String[] args) throws InterruptedException {
 
	  System.setProperty("webdriver.gecko.driver", "E:\\selenium3\\geckodriver.exe");
	
	   WebDriver driver=new FirefoxDriver();
	      
	   driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	   	         
	   driver.findElement(By.name("proceed")).click();
	     
	     Thread.sleep(5000);
	       
	     Alert alert= driver.switchTo().alert();
	       
	     System.out.println(alert.getText());
	    
	      String text = alert.getText();
	       
	      if(text.equals("Please enter a valid user name")){
	    	  
	    	  System.out.println("correct text message");
	      }
	    	  else {
	    		  
	    		  System.out.println("incorrect text message");
	    		  
	    	  }
	    	  
	        alert.accept();
	    
	        // alert.dismiss(); for cancel button 
	    
	        
	    
	      

	  

	}

}
