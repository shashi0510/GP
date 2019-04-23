package com.testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsTest {
	public WebDriver driver;
	
  @Test(dependsOnMethods = {"openBrowser"})
  
  public void f() throws InterruptedException {
	  	driver.findElement(By.id("email")).sendKeys("shashithegame005@gmail.com");
	  	Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("shashigame");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(3000);
		}
  @Test
  public void openBrowser() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","D:\\softwares\\Selenium\\chrome\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://www.facebook.com");
	  Thread.sleep(3000);
  }
  
  @Test(dependsOnMethods = {"f"})
  public void LogOut() throws InterruptedException {
		driver.findElement(By.id("userNavigationLabel")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log Out")).click();
	  
   }
  }
