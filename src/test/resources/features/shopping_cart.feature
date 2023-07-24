#Autor: Nicolas Caraballo Rojas
#language:en

@ShoppingCartTest


Feature: I as Nicolas guest wants to buy products on opencart.abstracta.us
  Scenario: Add products on shopping cart
    Given I am on the product catalog page
    When I add 5 products to the cart
    Then the cart should contain 5 products
    And the cart total should be the sum of the prices of 5 products added


  Scenario: Check shopping cart
    Given I view the cart
    Then I should see 5 products in the cart
    And the cart total of the 5 products should be displayed correctly

  Scenario Outline: Complete checkout as guest: 'Guest Checkout'
    Given I am on the checkout page
    When I select "Guest Checkout"
    And I enter my shipping information
      |<firstName>|<lastName>|<email>|<telephone>|<addressObligatory>|<city>|<postalCode>|<country>|<region>|
    And I enter my payment details
      |<payment_description>|
    And I check products on the cart
    And I confirm the order
    Then I should see a confirmation message with the text "Your order has been placed!"
    Examples:
      |firstName|lastName |     email   | telephone  |  addressObligatory|      city      |   postalCode  |country  |region|payment_description|
      |Nicolas  |Caraballo|test@test.com| 3008401234 |       calle26     |  Villavicencio |     90001     |Colombia | Meta | Description for payment|

    