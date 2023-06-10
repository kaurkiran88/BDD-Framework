Feature: DemoBlaze Send Message Feature

Scenario Outline: DemoBlaze Send Message Test

Given user is on Home Page and clicks on Login button
When title of page is STORE
Then user enters "<username>" and "<password>"
Then user clicks on Login button
Then user is logged in
Then user click on Contact link
Then user enters new message "<email>" and "<name>" and "<message>"
Then Send Message button is clicked by user
Then user quit

Examples: 
	    | username    | password       | email               | name       | message                  |
	    | kaurkiran88 | DemoBlaze@2023 | kaurk8@gmail.com    | Kiran      | I love this website!     |
	  	| kaurk123    | DemoBlaze@2    | kirank123@gmail.com | Kiran Kaur | This website is awesome! |
		