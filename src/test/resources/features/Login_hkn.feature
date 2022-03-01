Feature: Login functionality

  Scenario: Login with valid credential
    Given Navigate to login page
    When Enter "username" And "Password" and click login button
    Then