Feature: Login Action	of Biskane using data table

  Scenario: Test valid login using dataTable
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters credentails using dataTable
      | pooja@katchintech.com | Cust@123 |
    Then Message displayed Login Successfully
