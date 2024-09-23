Feature: Account page Feature

Background:
Given user has already logged in to application
|username| Password|
|standard_user| secret_sauce|

Scenario: Account page Title page
Given user is on Account Page
Then print title of homepage

Scenario: checking functionality of Add To CartButton
Given user is on Account Page
Then  AddToCartButton "AddToCart" is clickable 

Scenario: check the text of button changed after clicking
Given user is on Account Page
Then  Before clicking the text is "Add to cart"
Then After clicking the text is "Remove"
Then add on shopping cart button






