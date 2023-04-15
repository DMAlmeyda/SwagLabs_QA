Feature: add products into the shopping cart

  Scenario: 
    Given user open the browser
    And user goes to the website
    And user log in into the website
    When user click the button Add to cart
    Then the product is shown in the shopping cart
