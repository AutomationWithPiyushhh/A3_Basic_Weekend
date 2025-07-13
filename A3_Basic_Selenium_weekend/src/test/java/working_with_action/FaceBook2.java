package working_with_action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://facebook.com/");

		WebElement pwd = driver.findElement(By.id("pass"));

		Actions act = new Actions(driver);

//		act.sendKeys("admin" + Keys.TAB  + "admin@123" + Keys.ENTER).build().perform();
//		act.sendKeys(pwd,"admin@123").build().perform();

		act.sendKeys("admin").perform();
		act.keyDown(Keys.TAB).build().perform(); // keyDown => keyPress
		act.keyUp(Keys.TAB).build().perform();

		act.sendKeys("admin@123").build().perform();
		act.keyDown(Keys.ENTER).build().perform();
		act.keyUp(Keys.ENTER).build().perform();

		Thread.sleep(3000);
		driver.quit();
	}
}
