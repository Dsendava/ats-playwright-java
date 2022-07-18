package com.endava.automation.userinterfaces;

import com.microsoft.playwright.*;

public class Login {

    public static final String BaseUrl = "http://automationpractice.com/index.php";

    public final static String UserName = "#email";
    public final static String Password = "#passwd";
    public final static String LogIn = "a:text('Sign in')";
    public final static String Submit = "#SubmitLogin";

    public static Locator username;
    public static Locator password;
    public static Locator login;
    public static Locator submit;

    public Login (Page page){
     this.page = page;
     this.username = page.locator(UserName);
     this.password = page.locator(Password);
     this.login = page.locator(LogIn);
     this.submit = page.locator(Submit);

    }

}