package com.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		//Launch Browser
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/V4/");
		
		//Enter UserId
		driver.findElement(By.xpath("//input[@name='uid']")).clear();
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr172437");
		
		//Enter Password
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("etyqume");
		
		//Click Login
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
			
	}

}
