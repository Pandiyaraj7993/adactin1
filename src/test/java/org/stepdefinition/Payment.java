package org.stepdefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


public class Payment {
	public static WebDriver driver;

	@Given("user try to select payment product")
	public void user_try_to_select_payment_product() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PANDI\\eclipse-workspace\\cucumber\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.myntra.com/checkout/payment?loggedIn=true");
	   
	}

	@When("user try to select Credit card optin")
	public void user_try_to_select_Credit_card_optin() {
	WebElement credit = driver.findElement(By.xpath("//span[contains(text(),'CREDIT/DEBIT')]"));
	credit.click();
	}

	@When("user try to select Debit card optin")
	public void user_try_to_select_Debit_card_optin() {
		WebElement debit = driver.findElement(By.xpath("//span[contains(text(),'CREDIT/DEBIT')]"));
   debit.click();
	}

	@When("user try to select google pay optin")
	public void user_try_to_select_google_pay_optin() {
		WebElement googlepay = driver.findElement(By.xpath("//span[contains(text(),'GOOGLE PAY/PHONEPE')]"));
		  googlepay.click();
		//span[contains(text(),'GOOGLE PAY/PHONEPE')]  
	}

	@When("user try to select phonepe optin")
	public void user_try_to_select_phonepe_optin() {
		WebElement phonepe = driver.findElement(By.xpath("//span[contains(text(),'GOOGLE PAY/PHONEPE')]"));
		phonepe.click();
		
	   }




}
