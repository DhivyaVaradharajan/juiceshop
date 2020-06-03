package com.qa.bootcamp.builder;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
public class NewCustomer {
    public String email;
    public String password;
    public String repeatPassword;
}
