Feature: Place order Function

    Scenario: Confirm user can purchase successfully.
    Given Access home page
    When Add "<product>" to cart
    And Click Cart button
    And Click place order button
    And Input "<name>" and "<creditcard>"
    And Click button Purchase
    Then Confirm purchasecuccess with "Thank you for your purchase!"
    
     Examples: 
    |product          |name|creditcard|
    |Samsung galaxy s6|tran|123456789 |
    
    Scenario: Confirm user can not place order.
    Given Access home page
    When Add "<product>" to cart
    And Click Cart button
    And Click place order button
    And Input "<name>" and "<creditcard>"
    And Click button Purchase
    Then Confirm message "Please fill out Name and Creditcard."
    
     Examples:
   |product|name|creditcard|message|
	 |Samsung galaxy s6||123456789|Please fill out Name and Creditcard.|
	 |Nokia lumia 1520|tran||Please fill out Name and Creditcard.|
	 |Nexus 6|||Please fill out Name and Creditcard.|

  	Scenario: Confirm user can go back home page when click ok.
    Given Access home page
    When Add "<product>" to cart
    And Click Cart button
    And Click place order button
    And Input "<name>" and "<creditcard>"
    And Click button Purchase
    And click ok
    Then Confirm url 
    
    Examples:
   |product          |name|creditcard|
	 |Samsung galaxy s6|tran|123456789|  
	 
    