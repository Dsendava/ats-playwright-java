#LoginTest.feature

Feature: Login Structural Validation

  Scenario Outline: Negative scenarios - Login with invalid structural validation
    Given that I have navigated to login page
    When I login with '<username>' and '<password>'
    Then I should see the '<type>' error
    Examples:
      | username                | password      | type           |
      | valid@email.com         |               | emptyPassword  |
      | valid@email.com         | aa            | password       |
      | invalid-at-mail-dot-com | ValidPassword | email          |