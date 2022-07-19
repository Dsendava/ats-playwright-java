package com.endava.automation.runners.Login;

import com.endava.automation.utils.SetUpProperties;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/login",
        glue = "com.endava.automation.stepdefinition.Login",
        plugin = {"pretty"})
public class LoginTestRunner implements SetUpProperties {
    @BeforeClass
    public static void SetUp(){
        SetUpProperties.ReadProperties();
    }
}
