package com.qa.bootcamp.utils;

import com.qa.bootcamp.builder.NewCustomer;

public class BaseBuilders {

    public NewCustomer newCustomer() {
        return NewCustomer.builder().email("test@gmail.com")
            .password("password")
            .repeatPassword("password").build();
    }
}

