#RegisterTest.feature

Feature: Register flow
  As an unregistered user, I want to fill the registration form to create an account

  Scenario: Positive scenario - Successful register
    Given that I have navigated to register page
    When I fill all the required information inputs
    Then my account should be created and I should see my account page

