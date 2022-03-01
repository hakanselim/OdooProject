Feature: Login functionality

  Scenario: User should login with valid credential
    Given Navigate to login page
    When Enter "posmanager105@info.com" And "posmanager" and click login button
    Then User should land "Inbox" page