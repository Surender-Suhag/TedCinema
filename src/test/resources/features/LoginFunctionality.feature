@regression @ui
Feature: Users with valid credentials should be allowed to login.


  Scenario: Valid Active User Account
    Given a customer selects "Log in" option in "Home" Page
    When customer enters valid credentials
    Then customer should be navigated to "Show Details" Page
    And customer name should appear on "Show Details" Page

  Scenario: User is logged out after 10 minutes of ideal time
    Given valid user is logged in
    When I wait for 10 minutes
    And I click on show details
    Then Login screen should be displayed


  Scenario: Valid Disabled User Account
    Given a customer selects "Log in" option in "Home" Page
    When customer account is "disabled"
    Then "Account is disabled" error message should pop up

  Scenario: Invalid User Account
    Given a customer selects "Log in" option in "Home" Page
    When customer enters invalid credentials
    Then "Invalid Credentials" error message should pop up
    And customer should be given an option to reset password

  Scenario: Max Login trials of valid user
    Given a customer selects "Log in" option in "Home" Page
    When customer enters invalid password "3" times
    Then customer account should be disabled

  Scenario Outline: SQL Injection
    Given a customer selects "Log in" option in "Home" Page
    When user enters "= or true" in username field
    And user enters "= or true" in password field
    Then "Invalid Credentials" error message should pop up
    And customer should be given an option to reset password

    Examples:
      | UserName | Password |
      | \"=      | \"=      |
      | '=       | '=       |
      | true     | true     |