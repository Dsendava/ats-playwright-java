package com.endava.automation.userinterfaces;

import com.microsoft.playwright.*;

public class Login {

    public static final String BaseUrl = "http://automationpractice.com/index.php";

    private Page login;
    Locator emailInput = login.locator("#email");
    Locator passwordInput = login.locator("#passwd");
    Locator signInButton = login.locator("#SubmitLogin");
}
