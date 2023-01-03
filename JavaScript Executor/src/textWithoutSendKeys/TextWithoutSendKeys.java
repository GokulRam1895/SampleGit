package textWithoutSendKeys;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextWithoutSendKeys {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F:\\Selenium Practices\\Selenium_Basics\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0],value='gokul'", userName);
		
		
		
		
	}

}
