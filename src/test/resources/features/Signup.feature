Feature: SignupFeature

Scenario: Valid Account Signup
Given I open the browser
And I navigate to the FreeCRM website
And I click on to the signup link
When I choose the edition I want, and fill out all the required fields with valid information
And I click on the agree to terms check box
And I click on the submit button
Then I successfully create my account for the website

Scenario: Invalid Account Signup
Given I open the browser
And I navigate to the FreeCRM website
And I click on to the signup link
When I choose the edition I want, and fill out all the required fields with invalid information
And I dont click on the agree to terms check box
And I click on the submit button
Then I will not have my account created for the website

