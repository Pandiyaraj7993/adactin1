package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class BaseClass {
	public static WebDriver driver;
	public void luanch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PANDI\\eclipse-workspace\\cucumber\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);   
	
	}
	public static void fillText(WebElement e,String value) {
		e.sendKeys(value);
		
	}
	
	public static void buttonClick(WebElement e) {
		e.click();
		
	}
	public static void getAtt(WebElement e) {
		String att = e.getAttribute("value");
		System.out.println(att);
		
}
}
