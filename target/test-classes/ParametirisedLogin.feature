@SmokeTest
Feature: Testing Login Functionality

  Background: user is logged in
    Given the user has opened the browser
    And user is on login page

  Scenario Outline: Login with valid credential successfully

    When the user enters <username> and <password>
    Then user is navigated to the home page

    Examples:
    |username|password|
    |Mary    |12345   |
    |John    |12345   |

 @Important
  Scenario: Login with invalid credential

    When the user enters wrong credential
    Then error message appears to the user