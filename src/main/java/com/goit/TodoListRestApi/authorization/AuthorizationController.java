package com.goit.TodoListRestApi.authorization;

import com.goit.TodoListRestApi.authorization.dto.login.LoginRequest;
import com.goit.TodoListRestApi.authorization.dto.login.LoginResponse;
import com.goit.TodoListRestApi.authorization.dto.registration.RegistrationRequest;
import com.goit.TodoListRestApi.authorization.dto.registration.RegistrationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/authorization")
public class AuthorizationController {
    private final AuthorizationService authService;

    @PostMapping("/register")
    public RegistrationResponse register(@RequestBody RegistrationRequest request) {
        return authService.register(request);
    }

    @PostMapping("/login")
    public LoginResponse register(@RequestBody LoginRequest request) {
        return authService.login(request);
    }
}
