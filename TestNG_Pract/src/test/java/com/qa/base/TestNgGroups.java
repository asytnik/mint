package com.qa.base;

import org.testng.annotations.Test;

public class TestNgGroups {
	
	@Test(groups="Login")
	public void test_1(){
		System.out.println("test_1");
	}

	@Test(groups="TestMail")
		public void test_2(){
		System.out.println("test_2");
	}

	@Test(groups="TestMail")
		public void test_3(){
		System.out.println("test_3");
	}
	
	@Test(groups="TestDelete")
	public void test_4(){
		System.out.println("test_4");
	}

	@Test(groups="TestRandom")
		public void test_5(){
		System.out.println("test_5");
	}

	@Test(groups="TestClose")
		public void test_6(){
		System.out.println("test_6");
	}

}
