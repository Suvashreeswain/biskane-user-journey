 Feature: Biskane Artist Page Validation
 
 @BiskaneArtistSignupPage
 Scenario: Verify signup page with valid input
 Given Lunch chrome browser
 When User open biskane url 
 And Mouse hover on sign up menu
 When Click on Artist Signup from dropdown
 Then Verify user is redirected to Artist Sign Up screen
 When User enter First Name in Artist Sign Up page
 Then Verify First Name is displaying in fisrt name place
 When User enter Last Name in Artist Sign Up page
 Then Verify Last Name field in last name place
 When User enter Email Id in Artist Sign Up page
 Then Verify Email Id is displaying
 When User enter Contact Number in Artist Sign Up page
 Then Verify Contact Number is displaying in Artist page
 When User enter Password in Artist Sign Up page
 Then Verify Password field in Artist page
 When User enter confirm Password in Artist Sign Up page
 Then Verify confirm Password field Artist page
 When Click on Next Button
 #Then Verify the Artist page
 
 @ArtistProfilePageVerify
 Scenario: verify that my profile page appears when the user click on settings gear icon
 Given Lunch chrome browser
 When User open biskane url 
 When Click on login
 And User enter artist email Id 
 Then Verify artist email Id is displaying
 When User enter artist password
 Then Verify artist password field
 When User click on Sign in button
 Then Verify user redirected to artist home page
 When Click on settings gear icon
 Then Observe the page
 
 @ArtistUpdatePasswordLink
 Scenario: verify that user is able to click on update password link
 Given Lunch chrome browser
 When User open biskane url 
 When Click on login
 And User enter artist email Id  
 Then Verify artist email Id is displaying
 When User enter artist password
 Then Verify artist password field
 When User click on Sign in button
 
 @ArtistProfilePage 
 Scenario: verify that profile page appears when click on update profile link
 Given Lunch chrome browser
 When User open biskane url 
 When Click on login
 And User enter artist email Id  
 Then Verify artist email Id is displaying
 When User enter artist password
 Then Verify artist password field
 When User click on Sign in button
 Then Verify user redirected to artist home page
 When Click on settings gear icon
 Then Verify My profile page appears
 When Click on update bank info link
 Then Verify Bank info page appears
 When Click on update profile link
 Then Observe the page
 
 @ArtistProfileImageVerify
 Scenario: verify that user is able to upload image
 Given Lunch chrome browser
 When User open biskane url
 When Click on login
 And Login with Artist
 When Click on settings gear icon
 Then Verify My profile page appears
 When Upload image
 Then Verify image is Upload
 
 @ArtistPasswordPageVerify
 Scenario: verify update button without entering any data on update password page
 Given Lunch chrome browser
 When User open biskane url
 When Click on login
 And Login with Artist
 When Click on settings gear icon
 Then Verify My profile page appears
 When Click on update password link
 Then Update password page
 When Click on update button
 Then Verify the page
  

 
 