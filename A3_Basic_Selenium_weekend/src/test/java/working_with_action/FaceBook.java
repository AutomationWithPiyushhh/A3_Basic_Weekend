package working_with_action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://facebook.com/");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		act.moveToElement(link).perform();
		Thread.sleep(2000);
		act.moveToElement(loginBtn).perform();
		Thread.sleep(2000);
		act.contextClick().build().perform();
		
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.moveToElement(button).perform();
		act.doubleClick().build().perform();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
