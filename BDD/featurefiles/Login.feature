@Orange
Feature: Login Feature of orange HRM
Scenario Outline: Valid Login
Given User enters the url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When User enters username as "<username>" 
And He enters the password as "<password>"
And He click on login button
Then Home Page Should be displayed

Examples: 
|username|password|
|Admin|admin123|
#|Admin123|Admin|
#|Admin|manager|