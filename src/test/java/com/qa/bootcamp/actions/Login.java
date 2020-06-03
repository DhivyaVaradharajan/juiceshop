package com.qa.bootcamp.actions;

import com.qa.bootcamp.ElementFinder;
import com.qa.bootcamp.builder.NewCustomer;
import com.qa.bootcamp.pageElements.LoginElements;
import org.springframework.stereotype.Component;

@Component
public class Login extends ElementFinder {

    public void withValidCredentials(NewCustomer user) {
        findElement(LoginElements.email).sendKeys(user.getEmail());
        findElement(LoginElements.pass).sendKeys(user.getPassword());
        findElement(LoginElements.loginButton).click();
    }
}
