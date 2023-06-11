Feature: DemoBlaze Send Message Feature

Scenario: DemoBlaze Send Message Using Tables & Map Test

Given user is on Home Page and clicks on Login button
When title of page is STORE
Then user enters username and password
| username    | password       |
| kaurkiran88 | DemoBlaze@2023 | 

Then user clicks on Login button
Then user is logged in
Then user click on Contact link
Then user enters new message details and click on Send Message button
| email               | name       | message                  |
| kaurk8@gmail.com    | Kiran      | I love this website!     |
| kirank123@gmail.com | Kiran Kaur | This website is awesome! |

Then user quit