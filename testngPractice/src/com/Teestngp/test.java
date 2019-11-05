package com.Teestngp;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {

	@BeforeMethod
	public void test1() {
		System.out.println("before method");

	}
	@BeforeTest
	public void test3() {
		System.out.println("before test");		

	}
	@Test(priority =1)
	public void test5() {

		System.out.println("test5");
		
	}
	
	@Test(priority =2)
	public void test6() {

		System.out.println("test6");
		
	}
	@AfterTest
	public void test4() {
		System.out.println("after test");

	}
	
	@AfterMethod
	public void test2() {
		System.out.println("after method");

	}
}
