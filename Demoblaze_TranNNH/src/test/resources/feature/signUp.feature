Feature: Sign up Function

Scenario: Confirm user can sign up successfully with valid username and valid password.
    Given Access home page
    When Click signup button
    And Signup with input "<user>" and "<pass>"
    Then Display message "<message>"
    Examples: 
    |user           |pass    |message|
    |Huyen Tran2345 |han123 |Sign up successful.|
    
Scenario: Confirm user can not sign up successfully.
     Given Access home page
     When Click signup button
    And Signup with input "<user>" and "<pass>"
    Then Display error message "Please fill out Username and Password."
    Examples: 
    |user           |pass    |message|
    |               |han123  |Please fill out Username and Password.|
    |Huyen Tran2345 |        |Please fill out Username and Password.|
    |               |        |Please fill out Username and Password.|
  
Scenario: Confirm user can not sign up successfully when username already exist and password is filled in.
	  Given Access home page
     When Click signup button
    And Signup with input "<user>" and "<pass>"
	 Then Display error message "This user already exist."
	  Examples: 
    |user      |pass    |message|
    |Huyen Tran|tran123 |This user already exist.|
    
Scenario: Confirm user can close sign up dialog when clicking on the close button.
	  Given Access home page
    When Click signup button then click close button
	  Then Confirm go to back homepage


