package com.tr.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.tr.pages.LoginPage;
import com.tr.util.Driver;

public class LoginPageTest {
	@BeforeClass
	public void setUp(){
		Driver.getDriver().get("https://my.monsterindia.com/login.html");
		Driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t"); //- See more at: http://software-testing-tutorials-automation.blogspot.in/2015/02/how-to-open-tab-and-switching-between.html#sthash.xGgRmnID.dpuf
//		Set<String> handles = Driver.getDriver().getWindowHandles();
//		Object[] obj = handles.toArray();
//		for(String)
	}
	
	@AfterClass
	public void tearDown(){
		Driver.getDriver().close();
		Driver.getDriver().quit();
	}
	
	@Test
	public void verifyLoginPageText() throws Exception{
		String actual = LoginPage.verifyText();
		String expected = "Already a Member? Sign In";
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void loginFunctionalityTest(){
		LoginPage.loginFunction();	
	}
}
