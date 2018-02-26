package com.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
	WebDriver driver;

	
	@BeforeMethod
	public void setUp() {

		String url = "http://google.com";

		System.setProperty("webdriver.chrome.driver", "/home/sqa-user/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);

	}

	@Test()
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google123", "Title is not matched!!!");

	}
	
	@Test()
	public void googleLogoTest() {
		boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
		
		//Assert.assertTrue(b);
		Assert.assertEquals(b, true); // I can use this assertion too
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();

	}
}
