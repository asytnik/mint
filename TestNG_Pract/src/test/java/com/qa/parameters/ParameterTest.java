package com.qa.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"env", "browser", "url", "username"})
	public void yahooLoginTest(String env, String browser, String url, String username){
		
		//String url = "https://login.yahoo.com";
		
		if(browser.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "/home/sqa-user/Selenium/chromedriver");
			driver = new ChromeDriver();
			
		}else if(browser.equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "/home/sqa-user/Selenium/geckodriver");
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys(username);
		driver.findElement(By.id("login-signin")).click();
		
	}
	
	

}
