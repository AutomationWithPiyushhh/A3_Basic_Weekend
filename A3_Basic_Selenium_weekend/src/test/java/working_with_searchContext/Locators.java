package working_with_searchContext;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("admin");
		
//		WebElement pwd = driver.findElement(By.name("pass"));
		
//		WebElement pwd = driver.findElement(By.cssSelector("input[type='password']"));
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("1234567890");

//		Method chaining
//		driver.findElement(By.linkText("Forgotten password")).click(); -> NoSuchElementException
//		driver.findElement(By.partialLinkText("F")).click();
		
//		driver.findElement(By.className("_42ft")).click();
		
		driver.findElement(By.xpath(""));
		
		Thread.sleep(5000);
		driver.quit();
	}
}
