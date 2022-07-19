package com.endava.automation.stepdefinition.Login;

import com.endava.automation.models.User;
import com.endava.automation.tasks.Auth;
import com.microsoft.playwright.*;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.endava.automation.userinterfaces.Login.BaseUrl;


public class Fillin implements PlaywrightAssertions {


    Page newPage = CreateNewContext.getPage();
    Auth auth = new Auth(newPage);


    @Given("that I have navigated to login page")
    public void thatIHaveNavigatedToLoginPage() {

    }

    @When("I login with {string} and {string}")
    public void iLoginWithUsernameAndPassword(String username, String password) {
    }

    @Then("I should see my account page")
    public void iShouldSeeMyAccountPage() {
        VerifyPage.CheckUrl("http://automationpractice.com/index.php?controller=my-account", newPage);

    }


    @Then("I should see the {string} error")
    public void iShouldSeeTheTypeError(String type) {

    }
}
