package working_with_webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstLine {
	public static void main(String[] args) throws InterruptedException {
//		Launch the empty chrome browser
//		start the server
//		Load, register and re-initialize the ns members

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//						driver = new EdgeDriver();
//						driver = new FirefoxDriver();
		
		driver.get("https://www.instagram.com/"); //InvalidArgumentsException
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
//		System.out.println(driver.getPageSource());

//		maximizing the window
		Options opt = driver.manage();
		Window win = opt.window();
		
//		win.maximize();
//		Thread.sleep(3000);
//		win.minimize();
//		Thread.sleep(3000);
//		win.fullscreen();
	
		Dimension dim = win.getSize();
		System.out.println(dim);
		
		System.out.println("height : " + dim.getHeight());
		System.out.println("Width : " + dim.getWidth());
		
		Dimension dim2 = new Dimension(1000, 500);
//		win.setSize(dim2);
		
		
		Point pt = win.getPosition();
		System.out.println("location is : " + pt);
		System.out.println(pt.getX());
		System.out.println(pt.getY());
		
		
		Point pt2 = new Point(0, 0);
		win.setPosition(pt2);
		
		
//		Clicking on Meta link
//		driver.findElement(By.linkText("Meta")).click();
//		Thread.sleep(3000);
//		driver.close();
		
		
//		System.out.println("Instagram closed...");
		Thread.sleep(10000);
		driver.quit();
//		System.out.println("Everything closed...");
	}
}
