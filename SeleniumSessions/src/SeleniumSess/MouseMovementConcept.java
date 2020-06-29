package SeleniumSess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\selenium3\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");
		
		 Actions action =new Actions(driver);
		 
		 action.moveToElement(driver.findElement(By.linkText("header-addons")))
		 .build().perform();
		


	}

}