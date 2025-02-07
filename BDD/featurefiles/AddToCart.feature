Feature: Add To cart in swag Labs
Scenario Outline: Add an item to the cart
Given user should be present in "inventory" page of swag labs 
When he selects the "<Option>" option in the dropdown
And he clicks on add to cart button of the first item
Then the item should be added to the cart
When he clicks on cart icon
Then he should be present in "cart" page
When he clicks on checkout button 
Then "checkout-step-one" page should be displayed
When he enters the first name as "<FirstName>"
And he enters the last name as "<LastName>"
And he enters the zip code as "<Zipcode>"
And he clicks on continue button
Then user should be present in "checkout-step-two" page
When he clicks on finish button
Then "checkout-complete" page should be displayed and the message should be "THANK YOU FOR YOUR ORDER" 
Examples: 
|Option|FirstName|LastName|Zipcode|
|(A to Z)|Dinga|Dingi|600028|
|(high to low)|Admin|manager|560071|
|(Z to A)|Ram|Sam|566019|
|(low to high)|Pushpa|Srivalli|636502|