package SeleniumSess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFileUploadPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\selenium3\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\aa\\Desktop\\dsssb.txt");
		

	}

}
