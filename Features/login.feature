Feature: Checking the login Modules of Facebook

  Scenario: Checking User Login with valid data
    Given Facebook URl is launched
    When User Enters UserName and Password
    And User clicks Login button
    Then Validate and take Screenshot
