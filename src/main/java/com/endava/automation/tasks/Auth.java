package com.endava.automation.tasks;

import com.endava.automation.userinterfaces.Login;
import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class Auth extends Login {

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