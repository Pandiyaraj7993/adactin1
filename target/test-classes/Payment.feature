Feature: To Validate Login functionality

Background:
Given user try to select payment product

Scenario: User as to be select Credit/debit card option

When user try to select Credit card optin

And user try to select Debit card optin

Then verify the product if its search by user or not

Scenario: User as to be select google pay/phonepe option 

When user try to select google pay optin

And user try to select phonepe optin

Then verify the product if its search by user or not
