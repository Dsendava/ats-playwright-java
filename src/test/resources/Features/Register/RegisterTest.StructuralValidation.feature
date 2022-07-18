#RegisterTest.feature

Feature: Register flow
  As an unregistered user, I want to fill the registration form to create an account

  Scenario: Positive scenario - Successful register
    Given that I have navigated to register page
    When I fill all the required information inputs
    Then my account should be created and I should see my account page

  Scenario Outline: Negative scenarios - Register with incomplete information
    Given that I have navigated to register page
    When I fill the form with '<name>' '<lastname>' '<password>' '<address>' '<city>' '<zipcode>' '<number>'
    Then I should see the <type> error
    Examples:
      | name	   	   | lastname	    | password 	      | address	      | city	      | zipcode     | number	  | type 	|
      | undefined	   | some lastname  | some password   | Some address  | Some city     | 11111	     | 1111111111 | name 	|
      | some name	   | undefined	    | some password   | Some address  | Some city     | 11111	     | 1111111111 | lastname 	|
      | some name	   | some lastname  | undefined	      | Some address  | Some city     | 11111	     | 1111111111 | password 	|
      | some name	   | some lastname  | some password   | undefined     | Some city     | 11111	     | 1111111111 | address 	|
      | some name	   | some lastname  | some password   | Some address  | undefined     | 11111	     | 1111111111 | city 	|
      | some name	   | some lastname  | some password   | Some address  | Some city     | undefined    | 1111111111 | zipCode 	|
      | some name	   | some lastname  | some password   | some address  | Some city     | 11111	     | undefined  | number 	|
