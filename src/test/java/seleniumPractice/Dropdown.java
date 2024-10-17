package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		List<WebElement> bdayMonth= driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
		System.out.println("Number of birthday monstha are: "+ bdayMonth.size());
		bdayMonth.get(5).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
 