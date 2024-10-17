package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		//Scroll by pixel randomly
		JavascriptExecutor js =(JavascriptExecutor) driver;
		//Scroll down
		js.executeScript("window.scrollBy(0,300)");
		//scroll little up
		js.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(1000);
		
		
		//Scroll till we find webelement
		WebElement footerLink= driver.findElement(By.xpath("//a[@title='Log into Facebook']"));
		js.executeScript("arguments[0].scrollIntoView()",footerLink);
		Thread.sleep(1000);
		
		//Scroll all the way to bottom of page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		
		
		driver.quit();
		
				
		
	}

}

