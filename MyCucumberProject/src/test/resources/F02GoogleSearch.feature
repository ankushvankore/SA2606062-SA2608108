Feature: Validating the search functionality on Google

  Scenario: To validate search functionality
    Given Open Google application  
    When Enter a search keyword
    And Hit Enter
    Then A valid search result should display
