package SeleniumSess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
	// System.setProperty("Webdriver.gecko.driver", "E:\\selenium3\\geckodriver.exe");
	 System.setProperty("webdriver.gecko.driver", "E:\\selenium3\\geckodriver.exe");
	
	 WebDriver driver = new FirefoxDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().deleteAllCookies();
	 
	 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	 
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 
	 driver.get("https://www.ebay.com/");
	 
	 //driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Java");
	 
	 driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("Java");
	 
	 //dynamic id --input tag
	 //id= test_24
	 //id= test_45
	 //id =test_78 ids keeps changing the we use "contains"
	 
	// stars with
	 
	// id=test_test_56
     //id=test_test_78
     
     //driver.findElement(By.xpath("//input[starts-with(@id,'test_test_')]")).sendKeys("Test");
	 
	 // id = 457_test
	 //id=78_test
	 
	 //driver.findElement(By.xpath("//input[ends-with(@id,'_test')]")).sendKeys("test");
     
	 
	// driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("test");
	 
	 // for links custom xpath
	 // for links <a> html tag represents 
	 
	 driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
	 
	 

	}

}
