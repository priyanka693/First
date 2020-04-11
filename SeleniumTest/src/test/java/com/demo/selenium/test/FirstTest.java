package com.demo.selenium.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
  @Test
  public void f() throws InterruptedException {
	  Logger log = Logger.getLogger(FirstTest.class);
	  log.info("*****************Starting test*********************");
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka\\Desktop\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  Thread.sleep(5000);
	  driver.get("https://www.google.co.in");
	  //rrgrgrgr
	  log.warn("This is warning message....");
	  System.out.println("Mukesh changes ");
	  
	  Thread.sleep(5000);
	  
	  System.out.println(driver.getTitle());
	  log.info("****************Ending test***********************");
	  driver.quit();
	  
  }
}
