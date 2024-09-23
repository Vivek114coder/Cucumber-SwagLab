Feature: Busket page Feature

Background:
Given user has already logged in to application
|username| Password|
|standard_user| secret_sauce|

Scenario: Bucket Selected item
Given user is on bucket page
Then  select item clickable


Scenario: Bucket Checkoutbutton
Given user is on bucket page
Then  click on checkoutButton
