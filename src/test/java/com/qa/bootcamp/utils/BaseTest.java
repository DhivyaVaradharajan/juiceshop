package com.qa.bootcamp.utils;

import com.qa.bootcamp.DriverManagerFactory;
import com.qa.bootcamp.DriverType;
import com.qa.bootcamp.actions.Home;
import com.qa.bootcamp.actions.Login;
import com.qa.bootcamp.actions.NewUser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    private WebDriver driver;
    private NewUser newUserPage;
    private Home home;
    private Login login;

    @BeforeEach
    public void setUp() {
        driver = DriverManagerFactory.getManager(DriverType.CHROME);
        newUserPage = new NewUser(driver);
        home = new Home(driver);
        login = new Login(driver);

    }

    public WebDriver getDriver() {
        return driver;
    }

    @AfterEach
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    public NewUser customerCan() {
        return newUserPage;
    }

    public Home home() {
        return home;
    }

    public Login login() {
        return login;
    }
}
