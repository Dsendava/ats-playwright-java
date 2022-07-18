#LoginTest.feature

Feature: Login successful

  Scenario Outline: Login in the portal with Correct Credentials
    Given that I have navigated to login page
    When I login with my <username> and my <password>
    Then I should see my account page
    Examples:
      | username        | password      |
      | valid@email.com | validPassword |