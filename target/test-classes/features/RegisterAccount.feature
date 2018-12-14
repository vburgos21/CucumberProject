Feature: RegisterAccountFeature

Scenario: Valid Register Account
Given Selected browser opens
And I go to the Freecrm.com
And I click on to the signup link
When I choose the edition I want, and fill out "George" and "Jorge" and "GJorge@gmail.com" and "GJorge1" and "GJorge123" 
And I click on the agree to terms check box
And I click on the submit button
And I click on register account button
Then I successfully create my account for the website
