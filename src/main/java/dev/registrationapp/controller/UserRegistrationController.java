package dev.registrationapp.controller;


import dev.registrationapp.model.RegistrationRequest;
import dev.registrationapp.service.RegistrationService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="/api/v1/registration")
@AllArgsConstructor
public class UserRegistrationController {

    private final RegistrationService registrationService;

    @PostMapping(path = "register")
    public String register(@Valid @RequestBody RegistrationRequest registrationRequest) {
        return registrationService.register(registrationRequest);
    }

    @GetMapping(path = "confirm")
    public String confirm(@Valid @RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }

}
