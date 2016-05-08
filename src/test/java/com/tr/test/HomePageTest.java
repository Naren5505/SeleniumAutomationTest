package com.tr.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tr.pages.HomePage;
import com.tr.pages.LoginPage;
import com.tr.pages.SearchResultPage;

public class HomePageTest {

	WebDriver driver;
	HomePage homePage = null;
	public LoginPage loginPage;
		
	@BeforeTest
	
	public void setUp(){
		
		driver= new FirefoxDriver();
		driver.get("http://www.jobsite.co.uk/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyLoginPageText() throws Exception{

	homePage = new HomePage(driver);
	boolean flag = homePage.isSiteLogoDisplayed();
	Assert.assertTrue(flag, "Site logo is not displayed");
	driver.close();
//		WebElement textElement = driver.findElement()
		
	}
}
