package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EcomerseSearch extends HandleWebbasedpopup {
	public static WebDriver driver;
	@Given("user try to search product")
	public void user_try_to_search_product() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PANDI\\eclipse-workspace\\cucumber\\chrome\\chromedriver.exe");
		driver=new ChromeDriver(options);
		driver.get("https://www.myntra.com/");   
	}

	@When("user type the product name in search box{string}")
	public void user_type_the_product_name_in_search_box(String product) {
		WebElement search = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		search.sendKeys(product);
		String att = search.getAttribute("value");   
		System.out.println(att);	
			
			
		}
	@When("user click the search button")
	public void user_click_the_search_button() {
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
	   }
	@Then("verify the product if its search by user or not")
	public void verify_the_product_if_its_search_by_user_or_not() throws Throwable {
List<WebElement> listofproduct = driver.findElements(By.xpath("//h3[@class='product-brand']"));	
for (WebElement x : listofproduct) {
	String producttext = x.getText();
	System.out.println(producttext);
	
	
}	
handle();
//Thread.sleep(8000);
JavascriptExecutor js=(JavascriptExecutor)driver;
//refersh the page by using javascriptexecutor
//js.executeScript("history.go(0)");
//to get innertext by using javascriptexecutor
//String text = js.executeScript("return document.documentElement.innerText;").toString();
//System.out.println(text);
// To Genrate Alert By Using JavaScript
//js.executeScript("alert('Hello pandiya')");
	//String text1 = js.executeScript("return document.title;").toString();
	//System.out.println("***********");
	//System.out.println(text1);
//driver.manage().window().maximize();
//scroll down
//js.executeScript("window.scrollBy(0,5000)");
js.executeScript("window.location='https://www.facebook.com/'");
	String Url = js.executeScript("return document.URL").toString();
	System.out.println(Url);
	}
	}
	

