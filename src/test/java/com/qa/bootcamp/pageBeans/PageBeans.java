package com.qa.bootcamp.pageBeans;

import com.qa.bootcamp.actions.Home;
import com.qa.bootcamp.actions.Login;
import com.qa.bootcamp.actions.NewUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PageBeans {

    @Bean
    public NewUser can() {
        return new NewUser();
    }

    @Bean
    public Home home() {
        return new Home();
    }

    @Bean
    public Login login() {
        return new Login();
    }
}
