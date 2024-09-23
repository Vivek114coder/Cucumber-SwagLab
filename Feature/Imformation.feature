Feature: Imformation page Feature

Background:
Given user has already logged in to application
|username| Password|
|standard_user| secret_sauce|

Scenario: Bucket Feature
Given user is on Imforamtion page
Then  fill imfomation
Then  click on continuebutton


