package com.MyWebTests;

import org.testng.annotations.Test;

public class D08InvocationCount {
  @Test (invocationCount = 5)
  public void test() {
	  System.out.println("Test1 executed...");
  }
}
