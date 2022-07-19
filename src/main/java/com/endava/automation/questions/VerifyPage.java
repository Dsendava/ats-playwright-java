package com.endava.automation.questions;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import com.microsoft.playwright.Page;

public class VerifyPage {
    public static void CheckUrl (String url, Page page){
        assertThat(page).hasURL(url);
    }
}
