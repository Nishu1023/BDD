Feature: Add To cart in swag Labs
Scenario: Add an item to the cart
Given user should be present in home page of swag labs 
When he selects the low to high price option in the dropdown
And he clicks on add to cart button of the first item
Then the item should be added to the cart
When he clicks on cart icon
Then he should be present in cart page
When he clicks on checkout button 
Then checkout page should be displayed
When he enters the first name as "Tom"
And he enters the last name as "Jerry"
And he enters the zip code as "560085"
And he clicks on continue button
Then checkout step two page should be displayed
When he clicks on finish button
Then checkout complete page should be displayed