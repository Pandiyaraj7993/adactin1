package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	public static WebDriver driver;
	@Given("user has to be there in the facebook page")
	public void user_has_to_be_there_in_the_facebook_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PANDI\\eclipse-workspace\\cucumber\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	   
	}

	@When("user has to be fill the username and password")
	public void user_has_to_be_fill_the_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("aryaraj");
		driver.findElement(By.id("pass")).sendKeys("968838890");
	   
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']")).click();
		}

	@Then("verify the facebook page")
	public void verify_the_facebook_page() {
	Assert.assertEquals("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110", driver.getCurrentUrl());	  
	System.out.println("User cannot login to home page");
	}


}
