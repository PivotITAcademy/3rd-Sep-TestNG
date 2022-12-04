package com.learn.testNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FirstClass {

	

	@Test(invocationCount = 5)
	public void test1() {
		System.out.println("Run test 1");
	}
	
	@BeforeClass
	public void installTestNG() {
		System.out.println("Installing Test NG");
	}
	
	@AfterClass
	public void installedTestNG() {
		System.out.println("Installed Test NG");
	}
	
	@BeforeTest
	public void doSomething1time() {
		System.out.println("Learning Test NG annotations");
	}

	@BeforeMethod
	public void startIgnition() {
		System.out.println("open browser and load base URL");
	}


	@Test(enabled = false, dependsOnMethods = {"test"})
	public void test2() {
		System.out.println("Run test 2 is ignored");
		boolean isTrue=true;
		Assert.assertTrue(isTrue);
	}

	@Test
	public void test3() {
		System.out.println("Run test 3");
	}

	@Test(dependsOnMethods = {"test5"})
	public void test4() {
		System.out.println("Run test 4");
	}

	@Test
	public void test5() {
		System.out.println("Run test 5");
	}

	@AfterMethod
	public void stopTheCar() {
		System.out.println("close the browser");
	}

	@AfterTest
	public void doSomethingBeforeClosing() {
		System.out.println("Learnt Annotations");
	}

}
