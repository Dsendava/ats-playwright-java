package com.endava.automation.questions;

import com.microsoft.playwright.Page;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Contains {
    public static void TextValue(String locator, String expected, Page page) {
        assertThat(page.locator(locator)).containsText(expected);
    }
}
