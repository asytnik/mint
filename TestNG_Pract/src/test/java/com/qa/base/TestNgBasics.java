package com.qa.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	
	/* --- a sequence of performing ----
	Launch FF browser
	
	Login to app
	Fill mail form test
	Logout from app
	
	Login to app
	Delete mail text test
	Logout from app
	
	Login to app
	Search mail test
	Logout from app
	
	Close FF browser
	*/
	
	
	// 1
	@BeforeClass
	public void launchBrowser(){
		System.out.println("Launch FF browser");
	}
	
	// 2 -> 5 -> 8
	@BeforeMethod
	public void logIn(){
		System.out.println("Login to app");
	}
	
	// 3 
	@Test(priority=1)	
	public void fillMailFormTest(){
		System.out.println("Fill mail form test");
	}
	
	// 6
	@Test(priority=2, enabled=false)	// or enabled=true
	public void deleteMailTextTest(){
		System.out.println("Delete mail text test");
	}
	
	// 9
	@Test(priority=3)	
	public void searchMailTest(){
		System.out.println("Search mail test");
		int i = 9/0;
	}
	
	@Test(priority=4)	
	public void sendMailTest(){
		System.out.println("Send mail friends test");
	}
	
	//4 -> 7
	@AfterMethod
	public void logOut(){
		System.out.println("Logout from app");
	}
	
	// 10
	@AfterClass
	public void closeBrowser(){
		System.out.println("Close FF browser");
	}

}
