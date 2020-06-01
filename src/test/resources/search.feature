Feature: To Validate Login functionality

Scenario Outline: To Varify the user can able to login with incorrect data

Given user try to search product

When Try to login the page username as"<Username>",password as"<Password>"

And user click the login button

Then verify the login user cannot login the page 

Examples: 
|Username|Password|
|pandiyaraj|palanisamy|
