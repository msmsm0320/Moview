package io.msmsm0320.moview.domain.users.controller;

import io.msmsm0320.moview.domain.users.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController("/users")
@RequiredArgsConstructor
public class UsersController {

    @PostMapping("/signup")
    public void signup() {
    }

    @PostMapping("/login")
    public void login(){}

    @PostMapping("/logout")
    public void logout(){}

    @GetMapping("/me")
    public void getUserProfile(){}

    @PatchMapping("/me")
    public void updateUserProfile(){}

    @DeleteMapping("/me")
    public void deleteUserProfile(){}


}
