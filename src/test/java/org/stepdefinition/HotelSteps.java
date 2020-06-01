package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HotelSteps extends BaseClass {
	@Given("User Try To Login InValid User and Password")
	public void user_Try_To_Login_InValid_User_and_Password() {
		luanch("http://adactinhotelapp.com/");  
	
	}
	@When("Try to login the page username and password;")
	public void try_to_login_the_page_username_and_password(io.cucumber.datatable.DataTable d) {
		List<Map<String,String>> mp= d.asMaps();
		HotelLoginPom h=new HotelLoginPom();
		fillText(h.getUserName(), mp.get(0).get("Username"));
		fillText(h.getPassword(), mp.get(0).get("Password"));
		buttonClick(h.getLogin());
	  
	}

	
	@Then("verify the login user cannot login the page")
	public void verify_the_login_user_cannot_login_the_page() {
		Assert.assertEquals("http://adactinhotelapp.com/", driver.getCurrentUrl());	  
		System.out.println("User cannot login to home page");
		
	   
	}
	@When("Try to login the page username and password with valid data;")
	public void try_to_login_the_page_username_and_password_with_valid_data(io.cucumber.datatable.DataTable d1) {
		List<Map<String,String>> mp= d1.asMaps();
		HotelLoginPom h=new HotelLoginPom();
		fillText(h.getUserName(), mp.get(0).get("Username"));
		fillText(h.getPassword(), mp.get(0).get("Password"));
		buttonClick(h.getLogin());
	  
	}
	@When("Try to Login Hotel")
	public void try_to_Login_Hotel(io.cucumber.datatable.DataTable data) {
		List<Map<String,String>> mp= data.asMaps();
		HotelLoginPom h=new HotelLoginPom();
		fillText(h.getUserName(), mp.get(0).get("Username"));
		fillText(h.getPassword(), mp.get(0).get("Password"));
		buttonClick(h.getLogin());
	      	
	}
	@Then("verify the login user can login the page")
	public void verify_the_login_user_can_login_the_page() {
		Assert.assertEquals("http://adactinhotelapp.com/SearchHotel.php", driver.getCurrentUrl());	  
		System.out.println("User cannot login to home page");
	}
	
	@When("Try to Search Hotel{string},{string},{string}{string},{string},{string},{string},{string},{string} ,{string}")
	public void try_to_Search_Hotel(String Username, String Password, String Location, String Hotel, String RoomType, String Rooms, String CheckIn, String CheckOut, String Adults, String Children) {
		HotelLoginPom h=new HotelLoginPom();
		fillText(h.getUserName(), Username);
		fillText(h.getPassword(), Password);
		buttonClick(h.getLogin());
	    fillText(h.getLocation(), Location);
		fillText(h.getHotels(), Hotel);
		fillText(h.getRoom_type(), RoomType);
		fillText(h.getRoom_nos(), Rooms);
		fillText(h.getDatepick_in(), CheckIn);
		fillText(h.getDatepick_out(), CheckOut);
		fillText(h.getAdult_room(), Adults);
		fillText(h.getChild_room(), Children);
		buttonClick(h.getSubmit());
		}

	@Then("verify the Hotel Search page")
	public void verify_the_Hotel_Search_page() {
		Assert.assertEquals("http://adactinhotelapp.com/SelectHotel.php", driver.getCurrentUrl());	  
		System.out.println("User can Search Hotel");
	
	}
	@When("Search Hotel{string},{string},{string},{string},{string},{string},{string},{string},{string} ,{string}")
	public void search_Hotel(String Username, String Password, String Location, String Hotel, String RoomType, String Rooms, String CheckIn, String CheckOut, String Adults, String Children) {
		HotelLoginPom h=new HotelLoginPom();
		fillText(h.getUserName(), Username);
		fillText(h.getPassword(), Password);
		buttonClick(h.getLogin());
	    fillText(h.getLocation(), Location);
		fillText(h.getHotels(), Hotel);
		fillText(h.getRoom_type(), RoomType);
		fillText(h.getRoom_nos(), Rooms);
		fillText(h.getDatepick_in(), CheckIn);
		fillText(h.getDatepick_out(), CheckOut);
		fillText(h.getAdult_room(), Adults);
		fillText(h.getChild_room(), Children);
		buttonClick(h.getSubmit());
		buttonClick(h.getRadiobutton_0());
		buttonClick(h.getContinue());
		}


	@Then("verify the conform search page")
	public void verify_the_conform_search_page() {
		Assert.assertEquals("http://adactinhotelapp.com/BookHotel.php", driver.getCurrentUrl());	  
		System.out.println("User can Search Hotel");
	}



	@When("Book Hotel{string},{string},{string},{string},{string},{string},{string},{string},{string} ,{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void book_Hotel(String Username, String Password, String Location, String Hotel, 
			String RoomType, String Rooms, String CheckIn, String CheckOut, String Adults, String Children, 
			String First_name, String Last_Name, String Address, String CardNo, String CardType, String Month, 
			String Year, String CCVNo) throws Throwable {
		
		HotelLoginPom h=new HotelLoginPom();
		fillText(h.getUserName(), Username);
		fillText(h.getPassword(), Password);
		buttonClick(h.getLogin());
	    fillText(h.getLocation(), Location);
		fillText(h.getHotels(), Hotel);
		fillText(h.getRoom_type(), RoomType);
		fillText(h.getRoom_nos(), Rooms);
		fillText(h.getDatepick_in(), CheckIn);
		fillText(h.getDatepick_out(), CheckOut);
		fillText(h.getAdult_room(), Adults);
		fillText(h.getChild_room(), Children);
		buttonClick(h.getSubmit());
		buttonClick(h.getRadiobutton_0());
		buttonClick(h.getContinue());
		fillText(h.getFirst_name(), First_name);
		fillText(h.getLast_name(), Last_Name);
		fillText(h.getAddress(), Address);
		fillText(h.getCc_num(), CardNo);
		fillText(h.getCc_type(), CardType);
		fillText(h.getCc_exp_month(), Month);
		fillText(h.getCc_exp_year(), Year);
		fillText(h.getCc_cvv(), CCVNo);
		buttonClick(h.getBook_now());
		Thread.sleep(6000);
		getAtt(h.getOrder());	
	}

	@Then("verify hotel booking page")
	public void verify_hotel_booking_page() {
		Assert.assertEquals("http://adactinhotelapp.com/BookingConfirm.php", driver.getCurrentUrl());	  
		System.out.println("User can Search Hotel");
	}






}
