package com.qa.bootcamp.utils;

import com.qa.bootcamp.DriverManagerFactory;
import com.qa.bootcamp.DriverType;
import com.qa.bootcamp.actions.Home;
import com.qa.bootcamp.actions.Login;
import com.qa.bootcamp.actions.NewUser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@Configuration
@ExtendWith(SpringExtension.class)
@ComponentScan(basePackages = "com.qa.bootcamp")
@ContextConfiguration(classes = {BaseTest.class})
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class BaseTest {

    @Autowired
    protected WebDriver driver;

    @Bean
    public WebDriver getDriver() {
        return DriverManagerFactory.getManager(DriverType.CHROME);
    }


    @AfterEach
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
