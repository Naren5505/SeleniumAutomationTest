package com.tr.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyHomepage {
		
	public static void main (String args[])
	
	{
		
		String ExpHomepageTitle = "Welcome";
		String ExpCheckOutTitle= "Check Out";
		
		// Step 1 : Launch URL 
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("http://www.practiceselenium.com/welcome.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Verify Homepage
		
		String HomepageActualTitle = driver.getTitle();
		if (ExpHomepageTitle .equals(HomepageActualTitle))
		{
			System.out.println("HomePage verified");
			
		} 
		else
		{
			System.out.println("HomePage not verified");
		}
		
		//Click Check Out link
		
		WebElement CheckOut = driver.findElement(By.linkText("Check Out"));
		if (CheckOut.isDisplayed()) 
		{
			CheckOut.click();
		 System.out.println("CheckOut Clicked");
		 }
		else
		{
          System.out.println("CheckOut link is not present");
		}
		
		//Verify Checkout Page
		
		String CheckoutActualTitle = driver.getTitle();
		if (ExpCheckOutTitle .equals(CheckoutActualTitle))
		{
			System.out.println("Checkout page verified");
			
		} 
		else
		{
			System.out.println("Checkout page not verified");
		}
		
		// verify text boxes and send test data
		
		WebElement attribute = driver.findElement(By.id("email")) ;
		String Ptext = attribute.getAttribute("id");
		System.out.println("attribute is  " +Ptext);
		
		WebElement Tagname = driver.findElement(By.id("email")) ;
		String Ptext1 = Tagname.getTagName();
		System.out.println("Tagname  is  " +Ptext1);
		
		WebElement Email = driver.findElement(By.id("email"));
		if (Email.isDisplayed()) 
		{
			System.out.println("Email dispalyed");
			Email.sendKeys("naren@gmail.com");
		}
		else
		{
          System.out.println("Email textbox  is not present");
		}
		
		WebElement Name = driver.findElement(By.id("name"));
		if (Name.isDisplayed()) 
		{
			System.out.println("Name dispalyed");
			Name.sendKeys("Naren");
		}
		else
		{
          System.out.println("Name textbox  is not present");
		}
		
		WebElement Address = driver.findElement(By.id("address"));
		if (Address.isDisplayed()) 
		{
			System.out.println("Address dispalyed");
			Address.sendKeys("Rajajinagar Bangalore");
		}
		else
		{
          System.out.println("Name textbox  is not present");
		}
		
		WebElement Cardtype = driver.findElement(By.id("card_type"));
		//new Select(Cardtype).selectByVisibleText("Mastercard");
		new Select(Cardtype).selectByIndex(1);
		//new Select(Cardtype).selectByValue("Visa");
		
		
		if (Cardtype.isDisplayed()) 
		{
			System.out.println("Card Type dropdown dispalyed");
		}
	   else
		{
			System.out.println("Card Type dropdown is not dispalyed");
		}
		
		WebElement Cardnumber = driver.findElement(By.id("card_number"));
		if (Cardnumber.isDisplayed()) 
		{
			System.out.println("Card number text box dispalyed");
			Cardnumber.sendKeys("1234567890");	
		}
	   else
		{
			System.out.println("Card number text box is not dispalyed");
		}
		
		WebElement CardholderName = driver.findElement(By.id("cardholder_name"));
		if (CardholderName.isDisplayed()) 
		{
			System.out.println("Card holder Name text box dispalyed");
			CardholderName.sendKeys("Naren");	
		}
	   else
		{
			System.out.println("Card holder Name text box is not dispalyed");
		}
		
		WebElement VerificationCode = driver.findElement(By.id("verification_code"));
		if (VerificationCode.isDisplayed()) 
		{
			System.out.println("Verification Code text box dispalyed");
			VerificationCode.sendKeys("1234");	
		}
	   else
		{
			System.out.println("Verification Code text box is not dispalyed");
		}
		
		WebElement PlaceOrderButton = driver.findElement(By.xpath("//button[contains(.,'Place Order')"));
		if (PlaceOrderButton.isDisplayed()) 
		{
			System.out.println("Place Order Button is dispalyed");
			PlaceOrderButton.click();
			System.out.println("Place Order Button is Clicked");
		}
	   else
		{
			System.out.println("Place Order Button is not dispalyed");
		}
		
	}}