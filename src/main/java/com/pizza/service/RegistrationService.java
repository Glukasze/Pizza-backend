//package com.pizza.service;
//
//import com.pizza.model.registration.RegistrationRequest;
//import com.pizza.model.user.AppUser;
//import com.pizza.model.user.AppUserRole;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@AllArgsConstructor
//public class RegistrationService {
//
//    private final AppUserService appUserService;
//    private final EmailValidator emailValidator;
//
//    public void register(RegistrationRequest request) {
//        boolean isValidEmail =  emailValidator.test(request.getEmail());
//        if (!isValidEmail) {
//            throw new IllegalStateException("Email not valid");
//        }
//
//        appUserService.signUpUser(new AppUser(
//                request.getFirstName(),
//                request.getLastName(),
//                request.getEmail(),
//                request.getPassword(),
//                AppUserRole.USER
//                )
//        );
//    }
//}
