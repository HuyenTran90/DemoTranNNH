Feature: AboutUs Function

Scenario: Confirm screen will show "about us video" when clicking "about us" button
    Given Access home page
    When Click aboutus button
    Then Confirm "Pause"
   
    Scenario: Confirm user can close video when clicking on the close button.
	  Given Access home page
    When Click about us button then click close button
	  Then Confirm go to back homepage