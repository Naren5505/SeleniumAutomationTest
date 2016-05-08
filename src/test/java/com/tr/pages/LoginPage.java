package com.tr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.tr.util.Driver;

public class LoginPage {

	public static String verifyText() {
		String actual = null;
		WebElement element = Driver.getDriver().findElement(
				By.xpath("//div/table/tbody/tr[1]/td[1]"));
		if (element.isDisplayed()) {
			actual = element.getText();
		}
		return actual;
	}

	public static void loginFunction() {
		WebElement userName = Driver.getDriver().findElement(
				By.xpath("//input[@id='username_login']"));
		userName.clear();
		userName.sendKeys("abcd");
		WebElement password = Driver.getDriver().findElement(
				By.xpath("//input[@id='passwd_temp']"));
		password.clear();
		password.sendKeys("sddfg");
		WebElement signinButton = Driver.getDriver().findElement(
				By.xpath("//input[@id='button']"));
		signinButton.click();
		WebElement forgotUsername = Driver.getDriver().findElement(
				By.id("forgotUsername"));
		if (forgotUsername.isDisplayed()) {
			forgotUsername.click();
			/* Code For Handling pop up */
		} else {
			System.out.println("Forgot UserName Link is not displayed");
		}

		WebElement lnkforgotPass = Driver.getDriver().findElement(
				By.id("forgotPass"));

		if (lnkforgotPass.isDisplayed()) {
			System.out.println("Forgot Password Link is not displayed");
			lnkforgotPass.click();

			/* Code For Handling pop up */
		} else {
			System.out.println("Forgot Password Link is not displayed");
		}

		WebElement imgFacebook = Driver.getDriver().findElement(By.xpath(""));

		if (imgFacebook.isDisplayed()) {
			System.out.println("Facebook Link is not displayed");
			imgFacebook.click();

		} else {
			System.out.println("Facebook Link is not displayed");
		}

		WebElement btnSignup = Driver.getDriver().findElement(
				By.xpath("//input[@id='button']"));
		if (btnSignup.isDisplayed()) {
			System.out.println("Signup button is not displayed");
			btnSignup.click();

		} else {
			System.out.println("Signup button is not displayed");
		}

	}
}
