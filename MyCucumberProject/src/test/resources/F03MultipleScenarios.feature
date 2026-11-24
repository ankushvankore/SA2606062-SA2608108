Feature: Validating login on Practice page

  Background: 
    Given Launch Practice Page

  Scenario: To validate login functionality with valid data
    When Enter valid user name
    When Enter valid password
    And Click on Login button
    Then Home page should display

  Scenario: To validate login funtionlity with invalid data
    When Enter invalid user name
    When Enter invalid password
    And I Click on login button
    Then Error message should disply
