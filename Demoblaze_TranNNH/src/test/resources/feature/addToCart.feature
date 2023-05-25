Feature: AddToCart Function

Scenario: Confirm user can add product to cart when clicking on the add to cart button
    Given Access home page
    When Click product "<product>"
    And Click Add to cart button
    Then Confirm "Product added"
    
    Examples: 
    |product|
    |Samsung galaxy s6|
    |Nokia lumia 1520|
    |Nexus 6|
    
    Scenario: Confirm the price is displayed properly in cart
    Given Access home page
    When Click product "<product>"
    And Click Add to cart button, Click cart button
    Then Confirm title "<title>"
     Examples: 
    |product|title|
    |Samsung galaxy s6|Samsung galaxy s6|
    |Nokia lumia 1520|Nokia lumia 1520|
    |Nexus 6|Nexus 6|
    
    Scenario: Confirm the product is displayed properly in cart
    Given Access home page
    When Click product "<product>"
    And Click Add to cart button, Click cart button
    Then Confirm price "<price>"
     Examples: 
    |product|price|
    |Samsung galaxy s6|360|
    |Nokia lumia 1520|820|
    |Nexus 6|650|