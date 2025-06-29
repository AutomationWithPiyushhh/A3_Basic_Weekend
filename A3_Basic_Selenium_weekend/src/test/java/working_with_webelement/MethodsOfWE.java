package working_with_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWE {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement loginBtn = driver.findElement(By.name("login"));

//		Getters
		String tagOfLogin = loginBtn.getTagName();
		String attrOfLogin = loginBtn.getAttribute("data-testid");
		String sizeOfLogin = loginBtn.getCssValue("font-size");
		String textOfLogin = loginBtn.getText();
		
		Rectangle rect = loginBtn.getRect();
		System.out.println("Dim : " + rect.getDimension());
		System.out.println("W : " +rect.getWidth());
		System.out.println("H :" + rect.getHeight());
		System.out.println("Point :" + rect.getPoint());
		System.out.println("X :" + rect.getX());
		System.out.println("Y :" + rect.getY());
		
		System.out.println("tag of login : " + tagOfLogin);
		System.out.println("Text of login : " + textOfLogin);
		System.out.println("Attr of login : " + attrOfLogin);
		System.out.println("Size of login : " + sizeOfLogin);

		driver.findElement(By.id("email")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).clear();

//		loginBtn.click();
//		loginBtn.submit();

		driver.findElement(By.linkText("Create new account")).click();
		WebElement maleRadio = driver.findElement(By.cssSelector("input[value='2']"));

		if (maleRadio.isDisplayed() && maleRadio.isEnabled()) {
			maleRadio.click();
		}

		if (maleRadio.isSelected()) {
			System.out.println("Male is selected");
		}

		Thread.sleep(3000);
		driver.quit();
	}
}
