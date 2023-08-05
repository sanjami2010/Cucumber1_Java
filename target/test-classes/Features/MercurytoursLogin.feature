Feature: To Check login credentials

  Scenario: Check login successful with valid credentials.
    Given browser is open
    And user is on Mercury Tours login page
    When user enter username and password
    Then user is navigated to the home page
