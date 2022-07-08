package com.endava.automation.tasks;

import com.endava.automation.userinterfaces.Login;
import com.microsoft.playwright.*;

public class Auth extends Login {

    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext brContext = browser.newContext();

        Page page = brContext.newPage();
        page.navigate(BaseUrl);
        //emailInput.type(email);
        //passwordInput.type(password);
        //signInButton.click();
    }
}