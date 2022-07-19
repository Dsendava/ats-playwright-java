package com.endava.automation.runners.Register;

import com.endava.automation.utils.SetUpProperties;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Register",
        glue = "com.endava.automation.stepdefinition.Register",
        plugin = {"pretty"})
public class RegisterTestRunner implements SetUpProperties {
    @BeforeClass
    public static void SetUp() {
        SetUpProperties.ReadProperties();
    }
}