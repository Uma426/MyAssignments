Feature: Login functionality of Salesforce application 

Scenario: Login function with valid credentials 
	Given Launch the browser 
	And Load the url 
	And Enter the username as 'umarajan2124152@agentforce.com' 
	And Enter the password as 'Uma@testleaf26' 
	When Click on Login button 
	Then It should be logged in 
	
	
Scenario: Login function with invalid credentials 
	Given Launch the browser 
	And Load the url 
	And Enter the username as 'umarajan2124@agentforce.com' 
	And Enter the password as 'testleaf26' 
	When Click on Login button 
	But It should throw error message 
	
	
Scenario: Create a new account in Salesforce 
	Given Launch the browser 
	And Load the url 
	And Enter the username as 'umarajan2124152@agentforce.com' 
	And Enter the password as 'Uma@testleaf26' 
	 When Click on Login button 	 
	And Open the Sales application from App Launcher 
	And Click on the Accounts tab 
	And Click on the New button 
	And Enter 'RAJAN' as the account name 
	And Select public as ownership 
	And Save the account 
	Then The account should be created successfully
	
