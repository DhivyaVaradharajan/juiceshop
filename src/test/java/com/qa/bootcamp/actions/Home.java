package com.qa.bootcamp.actions;

import com.qa.bootcamp.ElementFinder;
import com.qa.bootcamp.pageElements.HomeHeaderElements;
import org.springframework.stereotype.Component;

@Component
public class Home extends ElementFinder {

    public Home skipBanner() {
        findElement(HomeHeaderElements.welcomeBanner).click();
        return this;
    }

    public boolean shouldBeLoggedIn() {
        findElement(HomeHeaderElements.myAccount).click();
        return findElement(HomeHeaderElements.logoutButton).isDisplayed();
    }
}
