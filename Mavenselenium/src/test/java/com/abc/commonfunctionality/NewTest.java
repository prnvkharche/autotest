package com.abc.commonfunctionality;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class NewTest {
	
  @Test (invocationCount=5)
  public void f() {
	  
	  System.out.println("iam test case");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("before method");
  }

  @BeforeClass
  public void beforeClass() {
	  
	 System.out.println("before class");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("beforetest");
  }

}
