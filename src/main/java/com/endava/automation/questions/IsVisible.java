package com.endava.automation.questions;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import com.microsoft.playwright.Page;

public class IsVisible {
    public static void CheckVisible(String locator, Page page) {
        assertThat(page.locator(locator)).isVisible();
    }
}
