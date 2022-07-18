package com.endava.automation.tasks;

import com.endava.automation.userinterfaces.Login;
import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class Auth_SaveCookies extends Login {

    public Auth_SaveCookies(Page page) {
        super(page);
    }

    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext brContext = browser.newContext(new Browser.NewContextOptions().setStorageStatePath(Paths.get("applogin.json")));

        Page page = brContext.newPage();
        page.navigate(BaseUrl);

    }
}