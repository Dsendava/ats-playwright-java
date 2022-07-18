package com.endava.automation.stepdefinition.Register;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fillin {
    @Given("that I have navigated to register page")
    public void thatIHaveNavigatedToRegisterPage() {
    }

    @When("I fill all the required information inputs")
    public void iFillAllTheRequiredInformationInputs() {
    }

    @Then("my account should be created and I should see my account page")
    public void myAccountShouldBeCreatedAndIShouldSeeMyAccountPage() {
    }

    @When("I fill the form with {string} {string} {string} {string} {string} {string} {string}")
    public void iFillTheFormWithNameLastnamePasswordAddressCityZipcodeNumber(String name, String lastname, String password, String address, String zipcode, String  number, String type) {
    }

    @Then("I should see the <type> error")
    public void iShouldSeeTheTypeError() {
    }
}
