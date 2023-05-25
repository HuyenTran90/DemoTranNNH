Feature: Login Function

Scenario: Confirm user can login successfully with valid username and valid password
    Given Access home page
    When Click login button
    And Login with input "<user>" and "<pass>"
    Then Confirm name of user "<nameofuser>"
    Examples: 
    |user      |pass    |nameofuser|
    |Huyen Tran|tran123 |Welcome Huyen Tran|
    
    Scenario: Confirm user can not login with valid username but password is not filled in.
    Given Access home page
    When Click login button
    And Login with input "<user>" and "<pass>"
    Then Confirm message "<message>"
    Examples: 
    |user      |pass    |message|
    |Huyen Tran|        |Please fill out Username and Password.|
    
    Scenario: Confirm user can not login successfully with valid username and invalid password
    Given Access home page
    When Click login button
    And Login with input "<user>" and "<pass>"
    Then Confirm message "<message>"
    Examples: 
    |user      |pass    |message|
    |Huyen Tran|tran123e|Wrong password.|
    
    Scenario: Confirm user can not login successfully with username is not filled in and password is filled in.
    Given Access home page
    When Click login button
    And Login with input "<user>" and "<pass>"
    Then Confirm message "<message>"
    Examples: 
    |user    |pass    |message|
    |        |tran123 |Please fill out Username and Password.|
    
    Scenario: Confirm user can not login successfully when the user is not registered
    Given Access home page
    When Click login button
    And Login with input "<user>" and "<pass>"
    Then Confirm message "<message>"
    Examples: 
    |user    |pass    |message|
    |tr22    |tr22    |User does not exist.|
    
    Scenario: Confirm user can not login successefully when username and password are not filled in.
    Given Access home page
    When Click login button
    And Login with input "<user>" and "<pass>"
    Then Confirm message "<message>"
    Examples: 
    |user    |pass    |message|
    |        |        |Please fill out Username and Password.|
    
    Scenario: Confirm user can close login screen when clicking on the close button.
	  Given Access home page
    When Click login button then click close button
	  Then Confirm go to back homepage
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    