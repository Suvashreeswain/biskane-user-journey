Feature: Biskane user journey

 @BiskaneHomepage
 Scenario: Verify Biskane home page
 Given Lunch chrome browser
 When User open biskane url 
 And Print Current URL
 Then Validate the home page logo
 When Print all the menu links
 And Click on shop now
 Then Verify that url gets displayed
 And Print the url
 Then Verify the title of this page 
 And Navigate back to home page
 When Click on Search and enter text
 And Click on the search result
 Then Verify the name
 #And Close the browser
 
 @BiskaneSignup
 Scenario: Verify Biskane Signup
 Given Lunch chrome browser
 When User open biskane url 
 And Mouse hover on sign up menu
 When Click on Customer Signup link in Sign up dropdown
 Then Verify user is redirected to Customer Sign Up screen
 And Verify the form fields
 When Enter data in to First Name,Last Name and Email field
 Then Verify user is able to input data in First Name,Last Name and Email
 When User enter data in Password and Confirm Password
 Then Verify the password and confirm password field
 When Click on I agree to The Terms of Service button
 #Then Verify Sign up button is clickable or not
 When Enter data in to Contact Number field
 Then Verify data is entering or not
 
 @BiskaneCustomerSignupPage
 Scenario: Successful Login with Valid Credentials
 Given Lunch chrome browser
 When User open biskane url 
 And Mouse hover on sign up menu
 When Click on Customer Signup link in Sign up dropdown
 Then Verify user is redirected to Customer Sign Up screen
 When User enter First Name
 Then Verify First Name is displaying
 When User enter Last Name
 Then Verify Last Name field
 When User enter Email Id
 Then Verify Email Id field
 When User enter Contact Number
 Then Verify Contact Number is displaying
 When User enter Password
 Then Verify Password field
 When User enter confirm Password
 Then Verify confirm Password field
 When User click on I agree to The Terms of Service button
 Then Verify button is clicked
 When User click i am not robot button
 And Click on sign up button
 Then Verify the sign up page
 
 @SignupWithInvalidCredentials
 Scenario: Login with invalid Credentials
 Given Lunch chrome browser
 When User open biskane url 
 And Mouse hover on sign up menu
 When Click on Customer Signup link in Sign up dropdown
 Then Verify user is redirected to Customer Sign Up screen
 When User dont enter data in First Name field
 Then Verify the error message
 When User enter more than 50 characters in first name field
 Then Verify the error message field
 When User enter blank space in first name field
 Then Verify the first name blank space error message
 When User enter data in First Name field
 Then Verify the required validation message
 When User dont enter data in Last Name field
 Then Verify the error message below Last Name
 When User enter more than 50 characters in last name field
 Then Verify the last name field error message
 When User enter blank space in last name field
 Then Verify the last name blank space error message 

 @CustomerPageOrder
 Scenario: verify user redirected to customer orders page when click on the orders tab
 Given Lunch chrome browser
 When User open biskane url
 When Click on login
 And Login with customer
 When Click on orders tab
 Then Observe the page
 
 @CustomerPage
 Scenario: verify that user is able to click on "Select Search Type" dropdown
 Given Lunch chrome browser
 When User open biskane url
 When Click on login
 And Login with customer
 When Click on orders tab
 And Click on Select Search Type dropdown
 Then Verify Search the page
 
 
 