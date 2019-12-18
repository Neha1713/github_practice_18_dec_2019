Feature: Login Action

Scenario: Successful Login with valid Credentials
      Given user is on Home Page
      When user navigate to Login Page
      And user enters UserName and Password
      Then Message displayed Login Successfully
      
Scenario: Successful Logout
      When User Logout from the Application
      Then message displayed Logout Successfully