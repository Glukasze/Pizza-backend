package com.pizza.controller;

import com.pizza.model.registration.RegistrationRequest;
import com.pizza.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/registration")
@AllArgsConstructor
public class RegistrationController {


    private final RegistrationService registrationService;

    @PostMapping
    public void register(@RequestBody RegistrationRequest request) {
        registrationService.register(request);
    }


}
