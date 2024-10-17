package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		//Locate element to double click
		WebElement doubleClickBtn= driver.findElement(By.id("doubleClickBtn"));
		
		//Scroll down
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView", doubleClickBtn);
		js.executeScript("window.scrollBy(0,300)");
		
		//Doublr click the button
		Actions act= new Actions(driver);
		act.doubleClick(doubleClickBtn).build().perform();
		act.
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
