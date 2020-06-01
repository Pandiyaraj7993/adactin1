Feature: To Validate Login functionality

Background:
Given User Try To Login InValid User and Password

Scenario: To Varify the user can able to login with incorrect data

When Try to login the page username and password;
|Username|Password|
|pandiyaraj|palanisamy|

Then verify the login user cannot login the page 

 Scenario: To Varify the user can able to login with valid data

When Try to login the page username and password with valid data;
|Username|Password|
|samsamsam|samsamsam|

Then verify the login user can login the page 
@SmokeTest 
Scenario Outline: To Varify the user can able to login with valid data

When Try to Search Hotel"<Username>","<Password>","<Location>""<Hotels>","<RoomType>","<Rooms>","<CheckIn>","<CheckOut>","<Adults>" ,"<Children>"

Then verify the Hotel Search page 

Examples:
|Username|Password|Location|Hotels|RoomType|Rooms|CheckIn|CheckOut|Adults|Children|
|samsamsam|samsamsam|Sydney|Hotel Creek|Double|1-One|05.06.2020|08.06.2020|2-Two|1-One|

@SmokeTest @Regression 
Scenario Outline: To Varify search Hotel

When  Search Hotel"<Username>","<Password>","<Location>","<Hotels>","<RoomType>","<Rooms>","<CheckIn>","<CheckOut>","<Adults>" ,"<Children>"

Then verify the conform search page 

Examples:
|Username|Password|Location|Hotels|RoomType|Rooms|CheckIn|CheckOut|Adults|Children|
|samsamsam|samsamsam|Sydney|Hotel Creek|Double|1-One|05.06.2020|08.06.2020|2-Two|1-One|

@Manual
Scenario Outline: Try to Book Hotel

When  Book Hotel"<Username>","<Password>","<Location>","<Hotels>","<RoomType>","<Rooms>","<CheckIn>","<CheckOut>","<Adults>" ,"<Children>","<First_name>","<Last_Name>","<Address>","<CardNo>","<CardType>","<Month>","<Year>","<CCVNo>"

Then verify hotel booking page 

Examples:
|Username|Password|Location|Hotels|RoomType|Rooms|CheckIn|CheckOut|Adults|Children|First_name|Last_Name|Address|CardNo|CardType|Month|Year|CCVNo|
|samsamsam|samsamsam|Sydney|Hotel Creek|Double|1-One|05.06.2020|08.06.2020|2-Two|1-One|Pandiya|Rajan|32,dr gopalan street palani|0987654321123456|VISA|May|2024|453|
 
 
 
 
