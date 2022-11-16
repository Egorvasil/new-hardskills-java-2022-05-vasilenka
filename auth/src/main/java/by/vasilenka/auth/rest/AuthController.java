package by.vasilenka.auth.rest;

import by.vasilenka.auth.dto.AuthRequestDto;
import by.vasilenka.auth.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auth")
@RequiredArgsConstructor
@RestController public class AuthController {

    private final AuthService authService;

    @PostMapping // http://localhost:8080/auth
    public String auth(@RequestBody AuthRequestDto authRequestDto){
        return authService.auth(authRequestDto);
    }

}
