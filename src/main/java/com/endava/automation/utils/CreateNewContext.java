package com.endava.automation.utils;

import com.microsoft.playwright.*;

import static com.endava.automation.utils.SetUpProperties.GetBoolean;

public interface CreateNewContext {

    Playwright playwright = Playwright.create();
    Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(GetBoolean("CONFIG.SET_HEADLESS")));
    BrowserContext brContext = browser.newContext();
    Page page = brContext.newPage();

    static Page getPage() {
        return page;
    }

}
