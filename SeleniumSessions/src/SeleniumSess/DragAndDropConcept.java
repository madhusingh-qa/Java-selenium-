package SeleniumSess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\selenium3\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
		.release()
		.build()
		.perform();
		
        // dynamic wait - we should use dynamic by using pageloadtime out 2. implicitewait  
		
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		 //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
