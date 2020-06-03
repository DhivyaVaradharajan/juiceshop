package com.qa.bootcamp.pageElements;

import org.openqa.selenium.By;

public class CreateNewUser {
    public static final By emailControl = By.id("emailControl");
    public static final By passwordControl = By.id("passwordControl");
    public static final By repeatPasswordControl = By.id("repeatPasswordControl");
    public static final By securityQuestion = By.name("securityQuestion");
    public static final By option = By.xpath("//span[@class='mat-option-text']");
    public static final By securityAnswerControl= By.id("securityAnswerControl");
    public static final By registerButton = By.id("registerButton");
}
