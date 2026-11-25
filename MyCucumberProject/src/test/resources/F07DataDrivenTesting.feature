Feature: Data driven testing on Practice page

  Scenario Outline: To validate login functionality
    Given Launch expand testing page
    When Enter user name as "<UserName>"
    When Enter password "<Password>"
    And Clcik on submit button
    Then The Home page should display

    Examples: 
      | UserName | Password             |
      | practice | SuperSecretPassword! |
      | pradnya  | pradnya123           |
      | practice | SuperSecretPassword! |
      | parul    | parul123             |
