package com.endava.automation.userinterfaces;

import com.microsoft.playwright.*;

import static com.endava.automation.utils.SetUpProperties.File;

public class RegisterForm {

    public final Page page;

    public static Locator customerfirstnameinput;
    public static Locator customerlastnameinput;
    public static Locator passwordinput;
    public static Locator firstnameinput;
    public static Locator lastnameinput;
    public static Locator addressinput;
    public static Locator cityinput;
    public static Locator stateselector;
    public static Locator zipcode;
    public static Locator countryselector;
    public static Locator mobilephone;
    public static Locator submitaccount;

    public final static String customerFirstNameInput = File.getProperty("ID.CUSTOMER_FN");
    public final static String customerLastNameInput = File.getProperty("ID.CUSTOMER_LN");
    public final static String passwordInput = File.getProperty("ID.PASSWORD");
    public final static String firstNameInput = File.getProperty("ID.FIRSTNAME");
    public final static String lastNameInput = File.getProperty("ID.LASTNAME");
    public final static String addressInput = File.getProperty("ID.ADDRESS_1");
    public final static String cityInput = File.getProperty("ID.CITY");
    public final static String stateSelector = File.getProperty("ID.STATE");
    public final static String zipCode = File.getProperty("ID.POSTCODE");
    public final static String countrySelector = File.getProperty("ID.COUNTRY");
    public final static String mobilePhone = File.getProperty("ID.MOBILE");
    public final static String submitAccount = File.getProperty("ID.SUBMIT_ACCOUNT");

    public RegisterForm(Page page) {
        this.page = page;
        this.customerfirstnameinput = page.locator(customerFirstNameInput);
        this.customerlastnameinput = page.locator(customerLastNameInput);
        this.passwordinput = page.locator(passwordInput);
        this.firstnameinput = page.locator(firstNameInput);
        this.lastnameinput = page.locator(lastNameInput);
        this.addressinput = page.locator(addressInput);
        this.cityinput = page.locator(cityInput);
        this.stateselector = page.locator(stateSelector);
        this.zipcode = page.locator(zipCode);
        this.countryselector = page.locator(countrySelector);
        this.mobilephone = page.locator(mobilePhone);
        this.submitaccount = page.locator(submitAccount);

    }
}
