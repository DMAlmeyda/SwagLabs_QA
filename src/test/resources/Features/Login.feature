Feature: Login

  Scenario Outline: The user wants to log in to the website
    Given user open browser
    And enter into the website
    When user enter <username> and <password>
    And press button Login
    Then is navigated to the website market

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
