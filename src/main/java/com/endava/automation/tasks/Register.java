package com.endava.automation.tasks;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Register {

    public class SearchPage {
        private final Page page;
        private final Locator searchTermInput;

        public SearchPage(Page page) {
            this.page = page;
            this.searchTermInput = page.locator("");

        }
    }
}
