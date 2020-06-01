package org.stepdefinition;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelLoginPom extends BaseClass {
	public HotelLoginPom() {
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(id="username")
	private WebElement UserName;
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(id="datepick_in")
	private WebElement datepick_in;
	
	@FindBy(id="datepick_out")
	private WebElement datepick_out;
	@FindBy(id="Submit")
	private WebElement Submit;
	
	
	
	
	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getDatepick_in() {
		return datepick_in;
	}

	public WebElement getDatepick_out() {
		return datepick_out;
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}
	

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton_0;
	@FindBy(id="continue")
	private WebElement Continue;
	
	
	@FindBy(id="first_name")
	private WebElement first_name;
	
	
	@FindBy(id="last_name")
	private WebElement last_name;
	
	
	@FindBy(id="cc_num")
	private WebElement cc_num;
	@FindBy(id="order_no")
	private WebElement order;
	
		
	
	public WebElement getOrder() {
		return order;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getBook_now() {
		return book_now;
	}
	@FindBy(id="cc_type")
	private WebElement cc_type;
	
	
	@FindBy(id="cc_exp_month")
	private WebElement cc_exp_month;
	
	
	@FindBy(id="cc_exp_year")
	private WebElement cc_exp_year;
	
	
	@FindBy(id="cc_cvv")
	private WebElement cc_cvv;
	
	
	@FindBy(id="address")
	private WebElement address;
	
	
	@FindBy(id="book_now")
	private WebElement book_now;
	
	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public WebElement getContinue() {
		return Continue;
	}
	@FindBy(id="login")
	private WebElement login;
	@FindBy(id="location")
	private WebElement Location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement room_type;
	@FindBy(id="room_nos")
	private WebElement room_nos;
	@FindBy(id="adult_room")
	private WebElement adult_room;
	@FindBy(id="child_room")
	private WebElement child_room;
		
	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
}
