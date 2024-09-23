Feature: FinalPage Feature

Background:
Given user has already logged in to application
|username| Password|
|standard_user| secret_sauce|

Scenario: check functionality  of final page
Given user is on final page
Then text "Thank you for your order!" is displayed
Then  back home button is diplayed 


