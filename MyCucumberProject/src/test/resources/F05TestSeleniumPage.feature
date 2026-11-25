@AllSeleniumTests
Feature: Validate tabs of Selenium Home Page

  Background: 
    Given Open "https://www.selenium.dev/"

  @SmokeTest
  Scenario: To validate Downloads Tab
    When Click on downloads tab link
    Then Downloads page should open

  @SanityTest
  Scenario: To validate Documentation Tab
    When Click on documentation tab link
    Then Documentation page should open

  @RegressionTest
  Scenario: To validate Project Tab
    When Click on Projects tab link
    Then Projects page should open

  @Validation
  Scenario: To validate Support Tab
    When Click on Support tab link
    Then Support page should open
    
    #Tags in Cucumber
    #Tags allows to execute or skip sinlge / multiple scenarios from feature file
    #Tags must be specified inside the feature file only. And before Scenario: keyword
    #Every tag starts with @
    #Execution crietria must be specified inside the Runner class only
