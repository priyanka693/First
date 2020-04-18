package iFrameDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameInsideFrame {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Priyanka\\Desktop\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
	/*
	 * its method to check the page is how many ifames
	 * if its find the element on frame its give me '1' other wise '0'
	 * 
	int size = driver.findElements(By.tagName("iframe")).size();
	System.out.println(size);
	for (int i= 0 ;i<=size; i++){
		driver.switchTo().frame(i);
		int j = driver.findElements(By.xpath("//div[@class='container']//iframe")).size();
		System.out.println(j);
		driver.switchTo().defaultContent();
	}
	*/
	driver.switchTo().frame(1);
	int size = driver.findElements(By.tagName("iframe")).size();
	System.out.println(size);
	driver.switchTo().frame(0);
	
	driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("i love priyanka");
	
	driver.quit();
	
	

	
	}

}
