Feature: Add Item into Cart

  Background:
    Given User is Logged into the application

  Scenario: User is able to add item into cart
    Given User click on Show All Notebooks and Laptop link on Homepage
    And User click on Mackbook product
    And User enter the quantity for product
    When User click on Add to Cart button for Macbook product
    And User click on Shoping cart link
    Then Macbook product is added into the shopping cart





