Feature: Login Form on Login Page
  As a Swag Labs User
  I want to have standard Login Page
  So that I can successfully login and have my own account

  Scenario Outline: UC_1 Verify Login form with empty credentials
    Given User choose '<browser>' browser
    And User opens the Login Page
    When User set '<userName>' username and '<password>' password on Login Page
    And User clears username and password fields
    And User clicks Login button
    Then Error message "Username is required" is displayed

    Examples:
      | browser | userName | password |
      | Chrome  | abc      | abc      |
      | Edge    | abc      | abc      |


  Scenario Outline: UC-2 Verify Login form with username only
    Given User choose '<browser>' browser
    And User opens the Login Page
    When User set '<userName>' username and '<password>' password on Login Page
    And User clears password field
    And User clicks Login button
    Then Error message "Password is required" is displayed

    Examples:
      | browser | userName | password |
      | Chrome  | abc      | abc      |
      | Edge    | abc      | abc      |


  Scenario Outline: UC-3 Verify Login form with valid credentials
    Given User choose '<browser>' browser
    And User opens the Login Page
    When User set '<userName>' username and '<password>' password on Login Page
    And User clicks Login button
    Then Page title is displayed and contains text "Swag Labs"

    Examples:
      | browser | userName      | password     |
      | Chrome  | standard_user | secret_sauce |
      | Edge    | standard_user | secret_sauce |