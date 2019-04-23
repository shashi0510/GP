package com.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
		
		static WebDriver driver;
		
	
	public static void chrome() throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\Selenium\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.demo.guru99.com/V4/");
	
	}
	public static void main(String[] args) throws Exception{
		
		String actualTitle;
		chrome();
						

				driver.findElement(By.xpath("//input[@name='uid']")).clear();
				driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(P.UserName);
						
				//Enter Password
				driver.findElement(By.xpath("//input[@name='password']")).clear();
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys(P.PassWord);
						
				//Click Login
				driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
							
				actualTitle = driver.getTitle();
				if(actualTitle.contains(P.ExpectedTitle)) {
						System.out.print("Title is True");
				}
				else {
						System.out.println("Title is False");
			}
				
	}

}
