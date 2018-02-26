package com.qa.base;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
//	@Test(invocationTimeOut=2000,expectedExceptions=NumberFormatException.class)
//	public void infinityLoopTest(){
//		
//		int i = 1;
//		while(i==1){
//			System.out.println(i);
//		     
//			
//		}
		
		
	@Test(expectedExceptions=NumberFormatException.class)
	public void test_1(){
		
		String a = "100A";
		Integer.parseInt(a);
			
		}
	}


