@GoogleTest #tags on feature level are inherited by its scenarios
Feature: Testing google search functionality

  Scenario: using google search successfully

    Given google browser is open
    And user is on google search page
    When the user enters a text in search box
    Then the user in navigated to search results