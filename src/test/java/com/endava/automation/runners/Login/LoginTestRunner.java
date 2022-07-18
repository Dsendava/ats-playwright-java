package com.endava.automation.runners.Login;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/login",
        glue = "com.endava.automation.stepdefinition.Login",
        plugin = {"pretty"})
public class LoginTestRunner {

}