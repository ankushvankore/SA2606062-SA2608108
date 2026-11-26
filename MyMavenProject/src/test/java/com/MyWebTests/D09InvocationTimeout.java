package com.MyWebTests;

import org.testng.annotations.Test;

public class D09InvocationTimeout {
  @Test (invocationTimeOut = 3000)
  public void myTest() throws InterruptedException {
	  System.out.println("Test started...");
	  Thread.sleep(2500);
	  System.out.println("Test ended...");
  }
}
