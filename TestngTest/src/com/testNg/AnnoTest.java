package com.testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnoTest {
  @Test
  public void f() {
	  System.out.println("this is 5th");
  }
  @Test
  public void test2() {
	  System.out.println("this is 7th");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is 4th");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is 6th");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is 3rd");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is 8th");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is 2nd");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is 9th");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is 1st");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is END");
  }

}
