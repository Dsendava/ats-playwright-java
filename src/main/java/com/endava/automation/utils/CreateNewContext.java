package com.endava.automation.utils;

import com.microsoft.playwright.*;

public class CreateNewContext {
    public static Playwright playwright = Playwright.create();
    public static Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(true));
    public static BrowserContext brContext = browser.newContext();
    public static Page page = brContext.newPage();

    public static Page getPage(){
        return page;
    }

}
