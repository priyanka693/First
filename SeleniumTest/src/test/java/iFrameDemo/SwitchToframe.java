package iFrameDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToframe {
	public static void main(String[] args) throws NoSuchElementException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Priyanka\\Desktop\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int size = driver.findElements(By.tagName("iframe")).size();

		for (int i = 0; i < size; i++) {
			driver.switchTo().frame(i);
			int total = driver.findElements(By.xpath("html/body/a/img")).size();
			System.out.println(total);
			driver.switchTo().defaultContent();
		}

	}
}