package com.qa.bootcamp.actions;

import com.qa.bootcamp.Base;
import com.qa.bootcamp.pageElements.HomeHeaderElements;
import org.openqa.selenium.WebDriver;

public class Home extends Base {
    public Home(WebDriver driver) {
        super(driver);
    }

    public Home skipBanner() {
        findElement(HomeHeaderElements.welcomeBanner).click();
        return this;
    }

    public boolean isLoggedIn() {
        findElement(HomeHeaderElements.myAccount).click();
        return findElement(HomeHeaderElements.logoutButton).isDisplayed();
    }
}
