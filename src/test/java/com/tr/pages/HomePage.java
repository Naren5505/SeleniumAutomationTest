package com.tr.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


	public class HomePage {
		
		WebDriver driver;
		boolean flag = false;
		String txt = null;
		WebElement element = null;
		public HomePage(WebDriver driver) {
			this.driver = driver;
		}
		
		By imgSiteLogo = By.xpath("//div[@class='logo']");
		By clkSiteLogo = By.xpath("//div[@class='logo']");
		
		
		public boolean isSiteLogoDisplayed() throws Exception{
			try {
				flag = driver.findElement(imgSiteLogo).isDisplayed();
				if (flag) {
					System.out.println("Site logo is displayed");
				}else {
					System.out.println("Site logo is not displayed");
				}
			} catch (Exception e) {
				throw new Exception("Site Logo verification failed::"+"isSiteLogoDisplayed"+e.getLocalizedMessage());
			}
			return flag;
		}
	}
