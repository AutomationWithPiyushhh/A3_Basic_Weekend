package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HerokuApp {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
		WebElement remove = driver.findElement(By.xpath("//button[text()='Remove']"));
		remove.click();
		
		WebElement add = driver.findElement(By.xpath("//button[text()='Add']"));
		add.click();
		
		WebElement enable = driver.findElement(By.xpath("//button[text()='Enable']"));
		enable.click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2)); 
		
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(15)); // explicit wait -> in parameter
		wait.pollingEvery(Duration.ofSeconds(2)); // explicit wait -> absent
		wait.ignoring(ElementClickInterceptedException.class); //To ignore the exception
		
		wait.until(ExpectedConditions.elementToBeClickable(
				By.cssSelector("input[type='text']")));
		
		
		WebElement input = driver.findElement(By.cssSelector("input[type='text']"));
		input.sendKeys("Kuch bhi...");
		
	}
}
