package com.endava.automation.stepdefinition.Login;

import com.endava.automation.models.User;
import com.endava.automation.tasks.Auth;
import com.microsoft.playwright.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.endava.automation.userinterfaces.Login.BaseUrl;


public class Fillin {

    Playwright playwright = Playwright.create();
    Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    BrowserContext brContext = browser.newContext();
    Page page = brContext.newPage();
    Auth auth = new Auth(page);


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
