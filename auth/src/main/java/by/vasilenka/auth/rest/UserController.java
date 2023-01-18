package by.vasilenka.auth.rest;

import by.vasilenka.auth.domain.User;
import by.vasilenka.auth.dto.AuthRequestDto;
import by.vasilenka.auth.services.AuthService;
import by.vasilenka.auth.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/user")
@RequiredArgsConstructor
@RestController public class UserController {

    private final UserService userService;

    @GetMapping // http://localhost:8080/user
    public List<User> getAllUsers(HttpServletRequest httpServletRequest){
        return userService.getAllUsers(httpServletRequest);
    }
}
