package com.qa.base;

import org.testng.annotations.Test;

public class TestNgDependency {
	
	@Test
	public void method_1(){
		
		System.out.println("method_1");
		
		 // int i = 9/0;
	}
	
	@Test(dependsOnMethods="method_1")
	public void method_2(){
		
		System.out.println("method_2");
		
	}

}

// if method_1 is failed
// then method_2 will be skipped

// if method_1 is passed
// then method_2 will be executed







