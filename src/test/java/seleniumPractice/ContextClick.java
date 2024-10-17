package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

		// Scroll down
		JavascriptExecutor js =(JavascriptExecutor) driver;
		//Scroll down
		js.executeScript("window.scrollBy(0,300)");

		// right click
		WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));

		Actions act = new Actions(driver);
		act.contextClick(rightClickButton).build().perform();
		

		Thread.sleep(1000);

		driver.quit();

	}

}
