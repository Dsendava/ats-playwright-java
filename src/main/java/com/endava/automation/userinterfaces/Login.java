package com.endava.automation.userinterfaces;


import com.microsoft.playwright.*;


import static com.endava.automation.utils.SetUpProperties.File;

public class Login  {

    public final Page page;
    public static final String BaseUrl = File.getProperty("UI.BASE_URL");
    public final static String UserName = File.getProperty("ID.EMAIL");
    public final static String Password = File.getProperty("ID.PASSWORD");
    public final static String LogIn = File.getProperty("ID.LOGIN");
    public final static String Submit = File.getProperty("ID.SUBMITLOGIN");

    public static Locator username;
    public static Locator password;
    public static Locator login;
    public static Locator submit;

    public Login(Page page) {
        this.page = page;
        this.username = page.locator(UserName);
        this.password = page.locator(Password);
        this.login = page.locator(LogIn);
        this.submit = page.locator(Submit);

    }

}