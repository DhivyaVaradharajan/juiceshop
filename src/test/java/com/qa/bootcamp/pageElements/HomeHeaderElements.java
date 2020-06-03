package com.qa.bootcamp.pageElements;

import org.openqa.selenium.By;

public class HomeHeaderElements {
    public static By welcomeBanner = By.xpath("(//button[contains(@aria-label,'Close Welcome Banner')])[1]");
    public static By myAccount = By.id("navbarAccount");
    public static By logoutButton = By.id("navbarLogoutButton");
}
