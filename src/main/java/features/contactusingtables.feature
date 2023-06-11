Feature: DemoBlaze Send Message Feature

Scenario: DemoBlaze Send Message Using Tables Test

Given user is on Home Page and clicks on Login button
When title of page is STORE
Then user enters username and password
| kaurkiran88 | DemoBlaze@2023 | 
Then user clicks on Login button
Then user is logged in
Then user click on Contact link
Then user enters new message details
| kaurk8@gmail.com    | Kiran      | I love this website!     |
Then Send Message button is clicked by user
Then user quit

