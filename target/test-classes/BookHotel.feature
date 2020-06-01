
Scenario Outline: Try to Book Hotel

When  Book Hotel"<Username>","<Password>","<Location>","<Hotels>","<RoomType>","<Rooms>","<CheckIn>","<CheckOut>","<Adults>" ,"<Children>","<First_name>",Last_Name>","<Address>","<CardNo>","<CardType>","<Month>","<Year>","<CCVNo>"

Then verify hotel booking page 

Examples:
|Username|Password|Location|Hotels|RoomType|Rooms|CheckIn|CheckOut|Adults|Children|First_name|Last_Name|Address|CardNo|CardType|Month|Year|CCVNo|
|samsamsam|samsamsam|Sydney|Hotel Creek|Double|1-One|05.06.2020|08.06.2020|2-Two|1-One|Pandiya|Rajan|32,dr gopalan street palani|0987654321123456|May|2024|453|
 
 