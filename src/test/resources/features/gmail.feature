Feature: Reset functionality on login page of Application 
Scenario: Successful Login
Given Open chrome and launch gmail			
When the user enters username as "testuser7919@gmail.com"
And the user enters password as "Srish@1234"			
Then the user can land on login page	




Scenario: Bad Login
Given Open chrome and launch gmail			
When the user enters username as "testuser7919@gmail.com"
And the user enters password as "gangto"			
Then the warning is displayed	
