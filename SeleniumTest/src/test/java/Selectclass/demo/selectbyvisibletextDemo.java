package Selectclass.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectbyvisibletextDemo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\Desktop\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement day= driver.findElement(By.id("day"));
		WebElement month= driver.findElement(By.id("month"));
		WebElement year= driver.findElement(By.id("year"));
		
		selectvaluefromdropdown(day, "15");
		selectvaluefromdropdown(month, "Jun");
		selectvaluefromdropdown(year, "1990");
		
		driver.quit();
	}
	
	public static void selectvaluefromdropdown(WebElement Element, String value)
	{
		Select select= new Select(Element);
        select.selectByVisibleText(value);
	}

}
