package com.testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\softwares\\Selenium\\chrome\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.myntra.com");
	  
	  WebElement contactUs = driver.findElement(By.xpath("//a[@href='/contactus']"));
	  Assert.assertTrue(contactUs.isDisplayed());
	  contactUs.click();
	  
  }
}
