package AutoITDemo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AutoitDemo1 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\Desktop\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\Desktop\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/autoit.html");		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.id("postjob")).click();			
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	     wait.until(
	    ExpectedConditions.elementToBeClickable(By.id("//*[@aria-labelledby='label_3']")));
	    		
	    		
	    driver.findElement(By.id("//*[@aria-labelledby='label_3']")).sendKeys("Gaurav");                                 					
	    driver.findElement(By.id("//*[@aria-labelledby='label_4']")).sendKeys("test.test@gmail.com");						
	    driver.findElement(By.id("//*[@name='q5_typeA']")).click();	
	    // below line execute the AutoIT script .
	     Runtime.getRuntime().exec("C:\\Users\\Priyanka\\Desktop\\Auto IT\\AutoIt1.exe");		
	    driver.findElement(By.id("input_6")).sendKeys("AutoIT in Selenium");					
	    driver.findElement(By.id("input_2")).click();
	    driver.close();
	     }
	
}
