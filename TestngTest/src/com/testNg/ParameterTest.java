package com.testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	WebDriver driver;
  @Test
  @Parameters({"sUser","sPass"})
  public void f(String sUser, String sPass) {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\softwares\\Selenium\\chrome\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.naukri.com");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  driver.findElement(By.id("login_Layer")).click();
	  driver.findElement(By.id("eLoginNew")).sendKeys(sUser);
	  driver.findElement(By.id("pLogin")).sendKeys(sPass);
	  driver.findElement(By.xpath("//button[@value='Login']")).click();
	  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
	  WebElement ls = driver.findElement(By.xpath("//a[@href='https://my.naukri.com/HomePage/view']"));
	  Actions action = new Actions(driver);
	  action.moveToElement(ls).perform();
	  driver.findElement(By.linkText("Logout")).click();
	  String title = driver.getTitle();
	  System.out.println("Your Title is:---" +title);
	  
	  }
}
