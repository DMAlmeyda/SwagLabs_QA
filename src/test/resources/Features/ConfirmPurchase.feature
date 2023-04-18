Feature: Confirm Purchase

  Scenario Outline: User wants to confirm purchase
    Given user open browser..
    And login into the website
    And buy some items
    And user goes to the shoping cart
    When user click checkout button
    And user type <name>, <surname> and <postal_code>
    And click continue button
    Then user is available to see the total price
    And click the final button, the purchase will be done and the programm will say Thank you for your order!

    Examples: 
      | name  | surname  | postal_code |
      | name1 | surname1 |        1718 |
