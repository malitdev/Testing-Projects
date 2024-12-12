@cart
Feature:Feature: Search for an Item on the Search field Then Add to Cart and verify Item
  Scenario: Login
    Given I navigate to amazon website
    When I enter Acer laptop into the search field
    And I click on the search button
    And I add searched item to the cart
    And I click on basket button
    Then I verify Acer laptop