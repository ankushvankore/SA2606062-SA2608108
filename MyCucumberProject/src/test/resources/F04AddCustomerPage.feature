Feature: Adding customer details on CRM Application

  Scenario: To add new customer on application
    Given Launch CRM Add customer page
    When Enter email Id as "satish@gmail.com"
    When Enter first name as "Satish"
    When Enter last name as "Selvraj"
    When Enter City as "Chennai"
    When Select state as "Florida"
    When Select gender "Male"
    When Select add to pramotional list
    And Click on Submit button
    Then Customer should get added
