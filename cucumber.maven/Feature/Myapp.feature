Feature: Test Google feature

  Background: User open browser

  #   Given Chrome is opened
  # Scenerio to search multiple krywords in google
  Scenario Outline: Search a keyword
    When I Enter a "<Keyword>" and press search
    Then Search results appear

    # Then Application should be closed
    Examples: 
      | Keyword  |
      | Selenium |
      | Cucumber |

  #Scenerio to check login using data table
  @web
  Scenario: Data table test
    Given User navigate to Linkedin
    When I enter valid data
       | Fields   | Values |
      | Username | test1  |
       | Password | xyz    |
    Then login should be unsuccessful
    
  # Scenerio to check unsuccessful login to linkedin
  @smoketest
  Scenario Outline: Login functionality for Linkedin
    Given User navigate to Linkedin
    When I enter Username as "<username>" and Password as "<password>"
    Then login should be unsuccessful

    # And Browser should be closed
    Examples: 
      | username | password |
      | test1    | abc      |
      | test2    | xyz      |


