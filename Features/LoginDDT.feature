Feature: Login Action	of Biskane using scenario outline 
Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "pooja@katchintech.com" and "Cust@123"
	Then Message displayed Login Successfully

Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully
	
Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "<username>" and "<password>"
	Then Message displayed Login Successfully
Examples:
    | username | password |
    |pooja@katchintech.com|Cust@123|
    |pooja@katchintech.com|Test@153|
    |pooja@katchintech.com|Store@123|
    |pooja@katchintech.com|Artist@123|

    
    
    