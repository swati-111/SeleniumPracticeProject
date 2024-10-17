package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts1 {
	@Test
	public void alert() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");

		// Maximize window
		driver.manage().window().maximize();

		// Create implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// scroll down page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

		// click 3rd "click me" button to see popup window
		driver.findElement(By.id("confirmButton")).click();

		// switch to popup window
		driver.switchTo().alert().accept();

		// accept the alert
		// alert.accept();
		System.out.println("Alert accepted");

		driver.findElement(By.id("confirmButton")).click();

		// switch to popup window
		Alert alert1 = driver.switchTo().alert();

		// accept the alert
		alert1.dismiss();
		System.out.println("Alert cancelled");

		// quit browser
		driver.quit();
	}

}
