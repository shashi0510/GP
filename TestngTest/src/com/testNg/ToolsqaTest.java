package com.testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ToolsqaTest {
  @Test
  @Parameters({ "sUsername", "sPassword" })
  public void f(String sUsername, String sPassword) throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\softwares\\Selenium\\chrome\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      driver.get("http://www.facebook.com");
      Thread.sleep(3000);
 
      	driver.findElement(By.id("email")).sendKeys(sUsername);
      	Thread.sleep(1000);
      	driver.findElement(By.id("pass")).sendKeys(sPassword);
      	Thread.sleep(1000);
      	driver.findElement(By.id("u_0_2")).click();
      	Thread.sleep(7000);
		driver.findElement(By.id("userNavigationLabel")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Log Out")).click();
 
      driver.quit();
  }
}
