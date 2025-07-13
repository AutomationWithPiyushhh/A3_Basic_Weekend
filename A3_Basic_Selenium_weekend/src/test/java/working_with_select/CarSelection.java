package working_with_select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CarSelection {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get(
				"C:/Users/User/git/A3_weekend/A3_Basic_Selenium_weekend/src/test/java/working_with_select/multiselect.html");

		WebElement carDD = driver.findElement(By.id("cars"));
		Select selCar = new Select(carDD);
		selCar.selectByVisibleText("BMW");
		selCar.selectByVisibleText("Opel");
		selCar.selectByVisibleText("Audi");

//		selCar.deselectByIndex(1);
//		selCar.deselectByIndex(2);
//		selCar.deselectByIndex(3);

		String firstSelected = selCar.getFirstSelectedOption().getText();
		System.out.println(firstSelected);

		List<WebElement> cars = selCar.getOptions();
		for (WebElement i : cars) {
			System.out.println(i.getText());
		}

		selCar.deselectAll();

		Thread.sleep(3000);
		driver.quit();
	}
}
