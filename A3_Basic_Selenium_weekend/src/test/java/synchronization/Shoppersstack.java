package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoppersstack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.shoppersstack.com/products_page/7");
		
		Thread.sleep(20000);
		WebElement pin = driver.findElement(By.id("Check Delivery"));
		pin.sendKeys("201301");
		Thread.sleep(500);
		WebElement check = driver.findElement(By.id("Check"));
		check.submit();
	}
}
