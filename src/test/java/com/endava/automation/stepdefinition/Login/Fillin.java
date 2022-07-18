package com.endava.automation.stepdefinition.Login;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.endava.automation.userinterfaces.Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Fillin {
    @Given("that I have navigated to login page")
    public void thatIHaveNavigatedToLoginPage() {

    }

    @When("I login with {string} and {string}")
    public void iLoginWithUsernameAndPassword(String username, String password) {
    }

    @Then("I should see my account page")
    public void iShouldSeeMyAccountPage() {
    }


    @Then("I should see the {string} error")
    public void iShouldSeeTheTypeError(String type) {
    }
}
