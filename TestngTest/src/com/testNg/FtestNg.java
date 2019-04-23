package com.testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import java.util.concurrent.TimeUnit;
public class FtestNg {
	WebDriver driver;
  @Test
  @Parameters({"sUsername", "sPassword"})
  public void f(String sUsername, String sPassword ) throws InterruptedException {
	  
	  //System.out.println("this wl b excuted 2nd");
	  
	    driver.findElement(By.id("email")).sendKeys(sUsername);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(sPassword);
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(7000);
		driver.findElement(By.id("userNavigationLabel")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Log Out")).click();
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\softwares\\Selenium\\chrome\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://www.facebook.com");
	  //Thread.sleep(7000);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  //driver.quit();
	  System.out.println("this wl b excuted last");
  }

}
