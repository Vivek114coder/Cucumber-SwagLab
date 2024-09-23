Feature: Overview page Feature

Background:
Given user has already logged in to application
|username| Password|
|standard_user| secret_sauce|

Scenario: Bucket Selected item
Given user is on overview page
Then validate the text "Checkout: Overview"
Then click on Finishbutton



