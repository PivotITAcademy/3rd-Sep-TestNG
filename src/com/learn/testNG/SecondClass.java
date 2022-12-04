package com.learn.testNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SecondClass {

	@Test(invocationCount = 5, priority = 1)
	public void test1() {
		System.out.println("Run test 1");
	}

	@BeforeMethod
	public void startIgnition() {
		System.out.println("open browser and load base URL");
	}

	@Test(enabled = true, priority = 2)
	public void test2() {
		SoftAssert sfAssert = new SoftAssert();
		System.out.println("Run test 2 is ignored");
		boolean isTrue = false;

		sfAssert.assertTrue(isTrue);
		System.out.println("This is line 29");

		sfAssert.assertEquals("My name is manvir", "My name is manvir", "Hi... I expect kuleep");
		sfAssert.assertAll();
	}

	@Test(priority = 4)
	public void test3() {
		System.out.println("Run test 3");
	}

	@Test(priority = 3)
	public void test4() {
		System.out.println("Run test 4");
	}

}
