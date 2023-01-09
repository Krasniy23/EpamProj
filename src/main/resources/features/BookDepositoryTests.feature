Feature: Desktop Checkout for Guest User
  As a customer
  I want to be able proceed to checkout
  So that I can specify my delivery and payment details and place the order

  Scenario: Proceed to basket, check that correct product was added
    Given in the search field send keys "Harry Potter"
    And click search button
    And save first product title
    And click add to cart button
    When click go to basket button
    Then check product title is equal to saved

  Scenario: Proceed to PLP, check that all prices are valid
    Given in the search field send keys "Harry Potter"
    When click search button
    Then check all prices are valid