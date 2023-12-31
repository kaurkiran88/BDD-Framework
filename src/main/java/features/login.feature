#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: DemoBlaze Login Feature

Scenario Outline: DemoBlaze Login Test 

Given user is on Home Page and clicks on Login button
When title of page is STORE
Then user enters "<username>" and "<password>"
Then user clicks on Login button
Then user is logged in
Then user quit

Examples: 
	    | username    | password       |
	    | kaurkiran88 | DemoBlaze@2023 | 
	    | kaurk123    | DemoBlaze@2    |
		