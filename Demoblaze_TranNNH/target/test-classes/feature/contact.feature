Feature: Contact Function

Scenario: Confirm user can send massage with email, name and message are filled in.
    Given Access home page
    When Click contact button
    And Send message with input "<email>" and "<name>" and "<message>"
    Then Confirm "<popup>"
    Examples: 
    |email    						|name           |message				|popup   											|
    |Huyentran@email.com  |Huyentran			|Wellcome		    |	Thanks for the message!!		|
    
    Scenario: Confirm user can not send massage when entering invalid format of email.
    Given Access home page
    When Click contact button
    And Send message with input "<email>" and "<name>" and "<message>"
    Then Confirm "<popup>"
    Examples: 
    |email    			|name           |message				|popup   											|
    |Huyentran@email|Huyentran			|Wellcome		    |	please re-enter your email format properly.		|
    
    Scenario: Confirm user can not send massage when email is left blank.
    Given Access home page
    When Click contact button
    And Send message with input "<email>" and "<name>" and "<message>"
    Then Confirm "<popup>"
    Examples: 
    |email    						|name           |message			|popup   										|
    |											|Huyentran			|Wellcome		  |	please fill out email.		|
    
    Scenario: Confirm user can not send massage when name is left blank.
    Given Access home page
    When Click contact button
    And Send message with input "<email>" and "<name>" and "<message>"
    Then Confirm "<popup>"
    Examples: 
    |email    					|name     |message			|popup   											|
    |Huyentran@email.com|    			|Wellcome		  |	please fill out name.		|
    
    Scenario: Confirm user can not send massage when message is left blank.
    Given Access home page
    When Click contact button
    And Send message with input "<email>" and "<name>" and "<message>"
    Then Confirm "<popup>"
    Examples: 
    |email    						|name           |message				|popup   											|
    |Huyentran@email.com  |Huyentran			| 						  |	please fill out message.		|
    
    Scenario: Confirm user can close send message dialog when clicking on the close button.
	  Given Access home page
    When Click contact button then click close button
	  Then Confirm go to back homepage