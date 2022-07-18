package com.endava.automation.tasks;

import com.endava.automation.userinterfaces.Login;
import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class Auth extends Login {

    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext brContext = browser.newContext();

        Page page = brContext.newPage();
        page.navigate(BaseUrl);
        page.click(LogIn);
        page.fill(UserName,"testafloyd@gmail.com");
        page.fill(Password,"asdasd1234");
        page.click(Submit);


        brContext.storageState(new BrowserContext.StorageStateOptions().setPath(Paths.get("applogin.json")));

    }
}