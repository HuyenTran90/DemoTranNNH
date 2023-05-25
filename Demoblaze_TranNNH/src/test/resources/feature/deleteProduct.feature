Feature: Delete Function

Scenario: Confirm user can delete product from cart when clicking on the delete button
    Given Access home page
    When Add product to cart "<product>"
    And Click cart and delete product
    Then Confirm delete success
    
    Examples: 
    |product|
    |Samsung galaxy s6|
    |Nokia lumia 1520|
    |Nexus 6|