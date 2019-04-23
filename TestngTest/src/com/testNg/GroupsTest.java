package com.testNg;

import org.testng.annotations.Test;

public class GroupsTest {
  @Test(groups = {"Car"})
  public void car1() {
	  System.out.println("This is Car Test 1");
  }
  @Test(groups = {"Car"})
  public void car2() {
	  System.out.println("This is Car Test 2");
	  }
  @Test(groups = {"Byk"})
  public void byk1() {
	  System.out.println("This is Byk Test 1");
  }
  @Test(groups = {"Byk"})
  public void byk2() {
	  System.out.println("This is Byk Test 2");
	 }
  @Test(groups = {"Car","Sedan Car"})
  public void sedancar() {
	  System.out.println("This is Sedan Car Test");
  }
}
