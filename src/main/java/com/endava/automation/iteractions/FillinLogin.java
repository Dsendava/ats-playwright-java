package com.endava.automation.iteractions;

import com.endava.automation.userinterfaces.Login;
import com.microsoft.playwright.Page;

public class FillinLogin extends Login {

    public FillinLogin(Page page) {
        super(page);
    }

    public void enterUserName(String email) {
        username.fill(email);
    }

    public void enterPassword(String pass) {
        password.fill(pass);
    }

    public void clickLoginButton() {
        login.click();
    }

    public void clickSubmtButton() {
        submit.click();
    }
}
