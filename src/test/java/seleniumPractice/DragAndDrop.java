package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	//http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		
		  //Scroll the page down 
		  JavascriptExecutor js= (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,250)");
		  
		  
		  //target and sorce webement 
		  WebElement sourceWebElement=driver.findElement(By.id("box3")); 
		  WebElement targetWebElement=driver.findElement(By.id("box103"));
		  
		  //Create Actions class object 
		  Actions act= new Actions(driver);
		  act.dragAndDrop(sourceWebElement, targetWebElement).build().perform();
		  
		  Thread.sleep(1000);
		 
		driver.quit();
		
		
	}

}
