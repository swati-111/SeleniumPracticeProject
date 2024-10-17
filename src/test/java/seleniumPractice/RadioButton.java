package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		Thread.sleep(2000);
		
			driver.findElement(By.xpath("//input[@value='1']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='2']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='-1']")).click();
			Thread.sleep(1000);
		driver.quit();
		

	}

}
