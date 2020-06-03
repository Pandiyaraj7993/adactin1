$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/HotelLogin.feature");
formatter.feature({
  "name": "To Validate Login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Try to Book Hotel",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Manual"
    }
  ]
});
formatter.step({
  "name": "Book Hotel\"\u003cUsername\u003e\",\"\u003cPassword\u003e\",\"\u003cLocation\u003e\",\"\u003cHotels\u003e\",\"\u003cRoomType\u003e\",\"\u003cRooms\u003e\",\"\u003cCheckIn\u003e\",\"\u003cCheckOut\u003e\",\"\u003cAdults\u003e\" ,\"\u003cChildren\u003e\",\"\u003cFirst_name\u003e\",\"\u003cLast_Name\u003e\",\"\u003cAddress\u003e\",\"\u003cCardNo\u003e\",\"\u003cCardType\u003e\",\"\u003cMonth\u003e\",\"\u003cYear\u003e\",\"\u003cCCVNo\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "verify hotel booking page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "Location",
        "Hotels",
        "RoomType",
        "Rooms",
        "CheckIn",
        "CheckOut",
        "Adults",
        "Children",
        "First_name",
        "Last_Name",
        "Address",
        "CardNo",
        "CardType",
        "Month",
        "Year",
        "CCVNo"
      ]
    },
    {
      "cells": [
        "samsamsam",
        "samsamsam",
        "Sydney",
        "Hotel Creek",
        "Double",
        "1-One",
        "05.06.2020",
        "08.06.2020",
        "2-Two",
        "1-One",
        "Pandiya",
        "Rajan",
        "32,dr gopalan street palani",
        "0987654321123456",
        "VISA",
        "May",
        "2024",
        "453"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Try To Login InValid User and Password",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelSteps.user_Try_To_Login_InValid_User_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Try to Book Hotel",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Manual"
    }
  ]
});
formatter.step({
  "name": "Book Hotel\"samsamsam\",\"samsamsam\",\"Sydney\",\"Hotel Creek\",\"Double\",\"1-One\",\"05.06.2020\",\"08.06.2020\",\"2-Two\" ,\"1-One\",\"Pandiya\",\"Rajan\",\"32,dr gopalan street palani\",\"0987654321123456\",\"VISA\",\"May\",\"2024\",\"453\"",
  "keyword": "When "
});
formatter.match({
  "location": "HotelSteps.book_Hotel(String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify hotel booking page",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelSteps.verify_hotel_booking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});