package com.endava.automation.userinterfaces;

import com.microsoft.playwright.*;

public class Login {

    public static final String BaseUrl = "http://automationpractice.com/index.php";

    public final static String UserName = "#email";
    public final static String Password = "#passwd";
    public final static String LogIn = "a:text('Sign in')";
    public final static String Submit = "#SubmitLogin";

}