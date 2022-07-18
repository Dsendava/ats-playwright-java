#LoginTest.feature

Feature: Login successful

  Scenario Outline: Negative scenarios - Login with invalid credentials
    Given that I have navigated to login page
    When I login with '<username>' and '<password>'
    Then I should see the '<type>' error
    Examples:
      | username                | password      | type           |
      | valid@email.com         | validPassword | authentication |
