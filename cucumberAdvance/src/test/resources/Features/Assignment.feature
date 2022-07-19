Feature: Testing Search functionality

  @capgemini
  Scenario: Check the google search with Chrome
    Given User is on google page
    When User enters text
    Then User closes the browser

  @accenture
  Scenario: Check the google search with Mozilla
    Given User is on google page
    When User enters text
    Then User closes the browser
