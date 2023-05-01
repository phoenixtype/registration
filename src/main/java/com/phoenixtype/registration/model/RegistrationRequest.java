package com.phoenixtype.registration.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;


@Component
@Data
@AllArgsConstructor
public class RegistrationRequest {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
}
