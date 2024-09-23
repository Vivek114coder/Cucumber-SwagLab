Feature: login Page feature
Scenario Outline: Login  with correct crendentils
Given user is on login page
When  user enter username <username> 
And  user enter Password <password>
And user click on login button 
Then  user gets the text "Products"


Examples:
| username | password |
| standard_user  | secret_sauce |
| problem_user   | secret_sauce|

## negative scenrio
Scenario Outline: login with invalid credentials
Given user is on login page
When user enter username <username>
And user enter Password <password>
And user click on login button
Then user remains on page

Examples:
| username | password |
| 123     | secret_sauce |
| standart_user| 123 |
