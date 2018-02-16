Feature: Test Google Search feature

  Scenario Outline: Search a keyword
    Given Chrome is opened
    When I Enter a "<Keyword>" and press search
    Then Search results appear
    Then Application should be closed

    Examples: 
      | Keyword  |
      | Selenium |
      | Cucumber |
