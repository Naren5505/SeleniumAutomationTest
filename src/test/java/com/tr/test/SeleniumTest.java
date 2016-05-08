package com.tr.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	WebDriver driver;
	Alert alert;
	WebDriverWait wait;
	String ExpHomepageTitle = "Welcome";

	
	
	@BeforeTest
	public void setUp(){
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.manage().window().maximize();
	}
	@Test
	public void TC01(){
		String HomepageActualTitle = driver.getTitle();
		if (ExpHomepageTitle .equals(HomepageActualTitle))
		{
			System.out.println("HomePage verified");
			
		} 
		else
		{
			System.out.println("HomePage not verified");
		}
	}
	}

