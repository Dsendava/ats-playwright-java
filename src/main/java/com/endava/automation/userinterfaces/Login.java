package com.endava.automation.userinterfaces;

import com.microsoft.playwright.*;

import static com.endava.automation.utils.SetUpProperties.File;

public class Login {

    public final Page page;

    public static Locator username;
    public static Locator password;
    public static Locator login;
    public static Locator submit;

    public static final String BaseUrl = File.getProperty("UI.BASE_URL");
    public static final String UserName = File.getProperty("ID.EMAIL");
    public static final String Password = File.getProperty("ID.PASSWORD");
    public static final String LogIn = File.getProperty("ID.LOGIN");
    public static final String Submit = File.getProperty("ID.SUBMIT_LOGIN");

    public Login(Page page) {
        this.page = page;
        this.username = page.locator(UserName);
        this.password = page.locator(Password);
        this.login = page.locator(LogIn);
        this.submit = page.locator(Submit);

    }
}