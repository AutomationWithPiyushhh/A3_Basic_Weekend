package working_with_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/"); // InvalidArgumentsException

		driver.findElement(By.partialLinkText("Forgo")).click();

		Navigation nav = driver.navigate();
		Thread.sleep(2000);
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();
		Thread.sleep(2000);
		nav.to("https://www.facebook.com/");

		Thread.sleep(5000);
		driver.quit();
	}
}
