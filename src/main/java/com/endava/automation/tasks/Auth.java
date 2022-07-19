package com.endava.automation.tasks;

import com.endava.automation.iteractions.FillinLogin;
import com.endava.automation.userinterfaces.Login;
import com.microsoft.playwright.*;


public class Auth extends Login {

    FillinLogin fillinLogin;

    public Auth(Page page) {
        super(page);
        this.fillinLogin = new FillinLogin(page);
    }

    public void loginIntoApplication(String email, String pass) {
        fillinLogin.clickLoginButton();
        fillinLogin.enterUserName(email);
        fillinLogin.enterPassword(pass);
        fillinLogin.clickSubmtButton();
    }
}