package com.qa.bootcamp.actions;

import com.qa.bootcamp.Base;
import com.qa.bootcamp.builder.NewCustomer;
import com.qa.bootcamp.pageElements.CreateNewUser;
import com.qa.bootcamp.utils.BaseBuilders;
import org.openqa.selenium.WebDriver;

public class NewUser extends Base {

    private NewCustomer newCustomer;

    public NewUser(WebDriver driver) {
        super(driver);
        newCustomer = new BaseBuilders().newCustomer();
    }

    public NewCustomer register() {
        findElement(CreateNewUser.emailControl).sendKeys(newCustomer.getEmail());
        findElement(CreateNewUser.passwordControl).sendKeys(newCustomer.getPassword());
        findElement(CreateNewUser.repeatPasswordControl).sendKeys(newCustomer.getRepeatPassword());
        findElement(CreateNewUser.securityQuestion).click();
        findElement(CreateNewUser.option).click();
        findElement(CreateNewUser.securityAnswerControl).sendKeys(newCustomer.getPassword());
        findElement(CreateNewUser.registerButton).click();
        return newCustomer;
    }
}
