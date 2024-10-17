
package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.findElement(By.xpath("//*[@class='rct-icon
		// rct-icon-uncheck']")).click();
		String checkboxName = driver.findElement(By.xpath("//*[@class='rct-title']")).getText();
		System.out.println(checkboxName);
		driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// scroll down to see command checkbox
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)");

		// Expand Desktop checkbox
		driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-expand-close']")).click();

		// Click on Command Checkbox
		driver.findElement(By.xpath("//span[text()='Commands']")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
