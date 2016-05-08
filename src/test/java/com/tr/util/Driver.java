package com.tr.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		driver= new FirefoxDriver();
		return driver;
	}
}
