package com.qa.bootcamp.actions;

import com.qa.bootcamp.Base;
import com.qa.bootcamp.builder.NewCustomer;
import com.qa.bootcamp.pageElements.LoginElements;
import org.openqa.selenium.WebDriver;

public class Login extends Base {
    public Login(WebDriver driver) {
        super(driver);
    }

    public void withValidCredentials(NewCustomer user) {
        findElement(LoginElements.email).sendKeys(user.getEmail());
        findElement(LoginElements.pass).sendKeys(user.getPassword());
        findElement(LoginElements.loginButton).click();
    }
}
