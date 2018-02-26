package com.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {

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

	@Test(priority=1,groups="Title")
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test(priority=2,groups="Logo")
	public void googleLogoTest() {
		boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
	}

	@Test(priority=3,groups="Link")
	public void mailLinklTest() {
		boolean b = driver.findElement(By.linkText("GMail")).isDisplayed();
	}

	@Test(priority=4,groups="Test")
	public void test1(){
		System.out.println("test1");
	}

	@Test(priority=5,groups="Test")
		public void test2(){
		System.out.println("test2");
	}

	@Test(priority=6,groups="Test")
		public void test3(){
		System.out.println("test3");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
