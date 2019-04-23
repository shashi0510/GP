package com.testNg;

import org.testng.annotations.Test;

public class PriorTest {
	
	 @Test(priority = 0)
	  public void f() {
		  System.out.println("This is Test 1");
	  }
	  @Test(priority = 1)
	  public void one() {
		  System.out.println("This is Test 2");
	  }
	  @Test(priority = 2)
	  public void two() {
		  System.out.println("This is Test 3");
	  }
	  @Test(priority =3)
	  public void three() {
		  System.out.println("This is Test 4");
	  }
}
